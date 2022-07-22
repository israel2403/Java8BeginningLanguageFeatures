package threads;

public class MyThreadClassTest {
    public static void main(String[] args) {
        MyThreadClass myThread = new MyThreadClass();
        myThread.start();

        Runnable aRunnableObject = () -> System.out.println("Hello from Java thread using runnable interface!");

        Thread myRunnableThread = new Thread(aRunnableObject);
        myRunnableThread.start();

        Thread myReferenceMethodThread = new Thread(ThreadTest::execute);
        myReferenceMethodThread.start();
    }
}
