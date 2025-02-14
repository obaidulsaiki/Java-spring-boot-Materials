//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // we have declared show function static, so it is not necessary to make instance
        // Interface
        interfaceClass.show();
        // Exception Handling + Finally Keyword
        ExceptionHandlingClass.show();
        // User-defined Exception Handling
        //UserDefinedException.show();
        //Thread ( Implementing runnable and extending thread)
        ThreadClass1.display();
        // Implementation of Thread Methods (Join , ActiveCount, sleep, synchronization)
        MultiThreading.display();
    }
}