public class Node {
  // attribute
  private String name;
  private Node next;

  // constructor
  public Node(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Cannot create node with name = null");
    }
    this.name = name;
    this.next = null;
  }

  // getter
  public String getName() {
    return name;
  }

  public Node getNext() {
    return next;
  }

  // setter
  public void setNext(Node next) {
    this.next = next;
  }

  // toString
  @Override
  public String toString() {
    return "'" + name + "'";
  }
  
}
