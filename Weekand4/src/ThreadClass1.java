//Thread is a small part of a program. It is used to provide multitasking capability provided by java.
// using thread, the program runs fast, and we can use cpu properly. 1 thread =1 core. if multiple thread done in one core than its Hyperthreading

//A thread in java goes through 5 stages New -> Runnable -> Running -> Blocked -> Terminated

// thread concept can be used in two way.
// 1. thread concept can be used by extending the class thread
class ThreadExmpl1 extends Thread{
        public void run()
        {
            System.out.println("This is from the thread");
        }
}

// 2. thread concept can be used by implementing the interfaces Runnable
class ThreadExmpl2 implements Runnable{
        public void run(){
            System.out.println("This is from the runnablee");
        }
}
public class ThreadClass1 {
    public static void display(){
        // For extending the thread class
        ThreadExmpl1 te1 = new ThreadExmpl1(); // initializing the thread class
        te1.start(); // first we need to start the thread
        // if we invoke run() it will work as a normal function
        // for implementing the Runnable class // this is prefereable as interface ssupports multiple inheritance
        Thread te2 = new Thread(new ThreadExmpl2());
        te2.start();



    }
}
