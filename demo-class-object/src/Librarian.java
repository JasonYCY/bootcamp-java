public class Librarian {
  private String name;
  private Library workingLibrary;

  public Librarian(String name) {
    this.name = name;
  }

  public boolean hiredTo(Library library) {
    if (library == null) return false;
    workingLibrary = library;
    return true;
  }

  public Book findBook(int targetBookId) {
    Book[] books = workingLibrary.getBooks();
    for (Book book : books) {
      if (book.getId() == targetBookId) return book;
    }
    return null;
  }

  public String getName() {
    return name;
  }

  public Library getWorkingLibrary() {
    return workingLibrary;
  }

  @Override
  public String toString() {
    return "(Name: " + name + ", Working At: " + workingLibrary + ")";
  }
}
