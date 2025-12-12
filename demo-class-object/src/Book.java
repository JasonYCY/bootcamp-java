public class Book {
  private static int nextId = 0;
  private int id = nextId++;
  private String title;

  private Book(String title) {
    this.title = title;
  }

  public static Book ofTitle(String title) {
    if (title == null) return new Book("unspecified");
    return new Book(title);
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "(ID: " + id + ", Title: " + title + ")";
  }
}
