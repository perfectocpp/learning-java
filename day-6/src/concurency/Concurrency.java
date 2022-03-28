package concurency;

public class Concurrency {
    public static void main(String[] args) {

        MyTask task1 = new MyTask("thread-1", 1000);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(new MyTask("thread-2", 1000));

        thread1.start();
        thread2.start();

    }
}
