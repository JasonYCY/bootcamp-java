import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // Polymorphism
    ArrayDeque<String> arrayDeque = new ArrayDeque<>();
    Deque<String> deque = arrayDeque;
    Queue<String> queue = arrayDeque;
    Collection<String> collection = arrayDeque;

    // 1) Deque
    deque.add("Name");
    deque.poll();
    deque.pollFirst();

    // 2) Queue
    queue.add("Name");
    queue.poll();
    // queue.pollFirst();

    // 3) Collection
    collection.add("Name");
    // collection.poll();
    // collection.pollFirst();



    // Queue Demo
    Queue<Student> studentQueue = new LinkedList<>(); // 90% scenario use LinkedList for Queue
    studentQueue.add(new Student("Leo", 50));
    studentQueue.add(new Student("Sally", 10));
    studentQueue.add(new Student("Peter", 99));
    System.out.println("Student Queue: " + studentQueue + "\n");
    
    Student nextStudent = studentQueue.poll();
    System.out.println("Poll: " + nextStudent);
    System.out.println("Peek: " + studentQueue.peek());
    System.out.println("Student Queue: " + studentQueue + "\n");

    Queue<String> fruits = new LinkedList<>(Arrays.asList("apple", "orange", "kiwi", "banana"));
    System.out.println("Fruit: " + fruits);

    while (!fruits.isEmpty()) {
      String fruit = fruits.poll();
      System.out.println("The current fruit: " + fruit);
    }






  }
}
