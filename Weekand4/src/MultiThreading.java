class MultiThreadingEx implements Runnable{
    @Override
    public void run(){
        for(int i = 0;i<5;i++)
        {
            System.out.println("Thread Number" + i);
            try {
                Thread.sleep(2000);// make a thread wait for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}
public class MultiThreading {
    public static void display(){
        Thread mte1 = new Thread(new MultiThreadingEx());
        Thread mte2 = new Thread(new MultiThreadingEx());
        mte1.start();
        // mte1.join() means it will fully complete its execution
        mte2.start();
        System.out.println("Total Threads :  "+ Thread.activeCount());


    }
}
