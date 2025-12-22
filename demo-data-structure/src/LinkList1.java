public class LinkList1 {
  // attribute
  private Node head;

  // constructor
  public LinkList1() {
    head = null;
  }

  // return list size
  public int size() {
    Node current = head;
    int size = 0;

    while (current != null) {
      size++;
      current = current.getNext();
    }

    return size;
  }

  // check is empty
  public boolean isEmpty() {
    return head == null;
  }

  // check if list contains string
  public boolean contains(String target) {
    Node current = head;

    while (current != null) {
      if (current.getName().equals(target)) {
        return true;
      }
      current = current.getNext();
    }

    return false;
  }

  // add string to the end of the list
  public void add(String name) {
    Node newNode = new Node(name);

    if (head == null) {
      head = newNode;
      return;
    }

    Node current = head;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(newNode);
  }

  // add string to list by index
  public void add(int targetIndex, String name) {
    if (targetIndex < 0 || targetIndex > size()) {
      throw new IndexOutOfBoundsException("Invalid index");
    }

    Node newNode = new Node(name);

    if (targetIndex == 0) {
      newNode.setNext(head);
      head = newNode;
      return;
    }

    Node current = head;
    for (int i = 0; i < targetIndex - 1; i++) {
      current = current.getNext();
    }

    newNode.setNext(current.getNext());
    current.setNext(newNode);
  }

  // remove string if it is in the list
  public boolean remove(String target) {
    if (head == null) return false;
    
    if (head.getName().equals(target)) {
      head = head.getNext();
      return true;
    }

    Node current = head;
    Node next = current.getNext();

    while (next != null) {
      if (next.getName().equals(target)) {
        current.setNext(next.getNext());
        return true;
      }
      current = next;
      next = next.getNext();
    }

    return false;
  }

  // getter
  public Node getHead() {
    return head;
  }

  // toString
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    for (Node cur = head; cur != null; cur = cur.getNext()) {
      builder.append(cur);
      if (cur.getNext() != null)
        builder.append(", ");
    }

    return "[" + builder + "]";
  }



  // main method
  public static void main(String[] args) {
    // test
    LinkList1 list = new LinkList1();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    System.out.println("Before: " + list);
    
    System.out.println("Removed: " + list.remove("A"));
    System.out.println("Removed: " + list.remove("B"));
    System.out.println("Removed: " + list.remove("C"));
    System.out.println("Removed: " + list.remove("D"));
    System.out.println("Removed: " + list.remove("E"));
    System.out.println("After: " + list);


  }
}
