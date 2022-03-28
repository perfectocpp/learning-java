package concurency;

public class MyTask implements Runnable{
    private String threadName;
    private long sleepTime;

    public MyTask (String threadName, long sleepTime){
        this.threadName = threadName;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(threadName);
            try {
                Thread.sleep(sleepTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
