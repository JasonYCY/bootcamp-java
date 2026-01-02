public class DemoThread {
  private int x;

  public int getX() {
    return x;
  }

  public void addOne() {
    x++;
  }





  // main method
  public static void main(String[] args) {
    DemoThread box = new DemoThread();
    System.out.println("Initial value of X: " + box.getX());

    Runnable addOneTask = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100_000; i++) {
          box.addOne();
        }
        System.out.println(Thread.currentThread().getName() + ": " + box.getX());
      }
    };

    Thread thread1 = new Thread(addOneTask, "Thread-1");
    Thread thread2 = new Thread(addOneTask, "Thread-2");
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Main Thread: " + box.getX());











  }
}
