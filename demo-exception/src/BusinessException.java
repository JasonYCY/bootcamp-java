public class BusinessException extends Exception {
  private int code;

  public BusinessException(SysCode sysCode) {
    super(sysCode.getMessage());
    this.code = sysCode.getCode();
  }

  public static BusinessException of(SysCode sysCode) {
    return new BusinessException(sysCode);
  }

  public int getCode() {
    return code;
  }

  // 1) Unchecked Exception (Parent -> RuntimeException.class)
  // 2) Checked Exception (Parent -> Exception.class)
  public static String fullName(String firstName, String lastName) throws BusinessException {
    if (firstName == null || lastName == null) {
      throw BusinessException.of(SysCode.NULL_PARAM);
    }
    return firstName + " " + lastName;
  }


  // main method
  public static void main(String[] args) {
    // test
    try {
      fullName("first", "last");
    } catch (BusinessException e) {
      e.printStackTrace();
    }
  }
}
