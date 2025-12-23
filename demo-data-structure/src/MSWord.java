import java.util.Deque;
import java.util.LinkedList;

public class MSWord {
  // attribute
  private StringBuilder content = new StringBuilder();
  private Deque<String> undoStack = new LinkedList<>();
  private Deque<String> redoStack = new LinkedList<>();

  // method
  public void addChar(char c) {
    undoStack.offerLast(content.toString());
    redoStack.clear();
    content.append(c);
  }
  
  public void addString(String str) {
    undoStack.offerLast(content.toString());
    redoStack.clear();
    content.append(str);
  }

  public void undo() {
    if (!undoStack.isEmpty()) {
      redoStack.offerLast(content.toString());
      content = new StringBuilder(undoStack.pollLast());
    }
  }

  public void redo() {
    if (!redoStack.isEmpty()) {
      undoStack.offerLast(content.toString());
      content = new StringBuilder(redoStack.pollLast());
    }
  }

  public void clear() {
    undoStack.offerLast(content.toString());
    redoStack.clear();
    content = new StringBuilder();
  }

  public String getContent() {
    return content.toString();
  }

  @Override
  public String toString() {
    return content.toString();
  }




  // main method
  public static void main(String[] args) {
    // test
    MSWord document = new MSWord();
    document.addString("Hello");
    document.addString(" world");
    document.addChar('!');
    System.out.println("Content: " + document);
    
    document.undo();
    System.out.println("(Undo)");
    System.out.println("Content: " + document);
    
    document.undo();
    System.out.println("(Undo)");
    System.out.println("Content: " + document);
    
    document.undo();
    System.out.println("(Undo)");
    System.out.println("Content: " + document);
    
    document.undo();
    System.out.println("(Undo)");
    System.out.println("Content: " + document);
    
    document.redo();
    System.out.println("(Redo)");
    System.out.println("Content: " + document);
    
    document.redo();
    System.out.println("(Redo)");
    System.out.println("Content: " + document);
    
    document.redo();
    System.out.println("(Redo)");
    System.out.println("Content: " + document);

    document.undo();
    System.out.println("(Undo)");
    System.out.println("Content: " + document);
    
    document.undo();
    System.out.println("(Undo)");
    System.out.println("Content: " + document);
    
    document.undo();
    System.out.println("(Undo)");
    System.out.println("Content: " + document);






  }
}
