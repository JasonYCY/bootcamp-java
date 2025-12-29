public enum SysCode {
  NULL_PARAM(10000, "Parameter cannot be NULL"),
  NOT_FOUND(10001, "Not Found"),
  CONNECT_FAIL(10002, "Connection Fail");

  private int code;
  private String message;

  private SysCode(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
