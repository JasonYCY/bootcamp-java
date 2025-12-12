public class Library {
  private static int nextId = 0;
  private int id = nextId++;
  private String name;
  private Librarian librarian;
  private Book[] books;
  
  public Library(String name) {
    this.name = name == null ? "null" : name;
    this.books = new Book[0];
  }

  public boolean hire(Librarian librarianToHire) {
    if (librarian == null) {
      boolean hiringSuccess = librarianToHire.hiredTo(this);
      if (hiringSuccess) {
        librarian = librarianToHire;
        return true;
      }
    }
    return false;
  }

  public boolean add(Book bookToAdd) {
    if (bookToAdd == null) return false;
    Book[] newBooks = new Book[books.length + 1];
    for (int i = 0; i < books.length; i++) {
      newBooks[i] = books[i];
    }
    newBooks[newBooks.length - 1] = bookToAdd;
    books = newBooks;
    return true;
  }

  public boolean add(Book[] booksToAdd) {
    if (booksToAdd == null) return false;
    Book[] newBooks = new Book[books.length + booksToAdd.length];
    for (int i = 0; i < books.length; i++) {
      newBooks[i] = books[i];
    }
    for (int i = 0; i < booksToAdd.length; i++) {
      newBooks[i + books.length] = booksToAdd[i];
    }
    books = newBooks;
    return true;
  }

  public String getName() {
    return name;
  }

  public Librarian getLibrarian() {
    return librarian;
  }

  public Book[] getBooks() {
    return books;
  }

  public int getId() {
    return id;
  }

  public String getBookList() {
    StringBuilder builder = new StringBuilder();
    for (Book book : books) {
      builder.append(book);
      builder.append("\n");
    }
    return builder.toString();
  }

  @Override
  public String toString() {
    return "(Library: " + name + ")";
  }




  // Librarian
  // Book
  // Each Library has ONLY ONE librarian
  // A Library has many books
  // Library -> id
  // Book -> id
  public static void main(String[] args) {
    // Create librarian
    Librarian john = new Librarian("John");

    // Create library
    Library centralLibrary = new Library("Central Public Library");

    // Hire librarian
    boolean hired = centralLibrary.hire(john);
    System.out.println("Librarian John hired: " + hired);

    // Generate book array using the ofTitle() method
    Book[] bookList = new Book[8];
    bookList[0] = Book.ofTitle("The Great Gatsby");
    bookList[1] = Book.ofTitle("To Kill a Mockingbird");
    bookList[2] = Book.ofTitle("1984");
    bookList[3] = Book.ofTitle("Pride and Prejudice");
    bookList[4] = Book.ofTitle("The Catcher in the Rye");
    bookList[5] = Book.ofTitle("Romeo and Juliet");
    bookList[6] = Book.ofTitle("War and Peace");
    bookList[7] = Book.ofTitle("The Hobbit");

    // Add all books to library at once
    centralLibrary.add(bookList);

    // Display results
    System.out.println("Library: " + centralLibrary.getName() + "\n");
    System.out.println("Librarian: " + centralLibrary.getLibrarian() + "\n");
    System.out.println("Book list: \n" + centralLibrary.getBookList());
    System.out.println("Total books: " + centralLibrary.getBooks().length + "\n");

    // Find book by book ID
    int targetBookId = 1;
    Book foundBook = john.findBook(targetBookId);
    System.out.println("Finding book by ID " + targetBookId + ": ");
    if (foundBook != null) {
      System.out.println("Book is found: " + foundBook);
    } else {
      System.out.println("Book not found!");
    }






  }
}