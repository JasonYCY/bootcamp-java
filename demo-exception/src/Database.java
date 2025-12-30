import java.util.ArrayList;
import java.util.List;

public class Database<T> {
  private List<T> values;

  public Database() {
    this.values = new ArrayList<>();
  }

  public boolean add(T value) {
    return values.add(value);
  }
  
  public boolean remove(T value) {
    return values.remove(value);
  }
  
  public boolean search(T value) {
    if (values.contains(value)) {
      return true;
    }
    throw new NotFoundException(SysCode.USERNAME_NOT_FOUND);
  }




  // main method
  public static void main(String[] args) {
    // Test
    Database<String> usernames = new Database<>();
    usernames.add("John Wong");
    usernames.add("Steve Chan");
    usernames.add("Cherry Lo");

    try {
      usernames.search("Leo Chan");
    } catch (BusinessRuntimeException e) {
      System.out.println(e.getMessage());
    }






  }
}
