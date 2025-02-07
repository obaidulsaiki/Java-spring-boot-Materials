//Exception handling is dealing with error
// Can be categorized in two types
// 1. Checked Exception (Compile time Exception): Detected by compiler and dealt based on what compiler knows. Ex - SQL, I/O we have to fix it
// 2. Unchecked Exception (Runtime Exception): Compiler cannot understand this, so we have to implement something to handle it. Ex - Arithmetic Exception, Null pointer Exception, ArrayOutOfBound Exception.
// Exception handling is done to improve user experience
public class ExceptionHandlingClass {
    public static void show() {
        // (Arithmetic Exception) occurs when a result comes undefined.
        int a = 5;
        int b = 0;
        //The int result = a/b; will result an exception to handle this we need to use try catch
        try { // In try block, we write the code that might be wrong a raise exception
            int result = a / b;
        }
        //there can be multiple catch block
        catch (ArithmeticException AE) {
            System.out.println("Exception Using ArithmeticException: " + AE.getMessage());
        }
        // Exception is the father class of AnyException class and Exception Class is extended from
        // Object class is the mother class of all exception
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            //e.printStackTrace(); shows what is wrong in details
        }
        finally {
            System.out.println("Finally block will always be invoked");
        }
        //Null pointer Exception - when we attempt to use an object that has null value assigned
        String s = null;
        try {
            System.out.println(s.length()); //this will throw an exception because we're trying to use a null value stored object

        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception: " + e.getMessage());
        }
        //ArrayIndexOutOfBound Exception - occurs when we are trying to access an Index that doesn't Exist
        int[] arr = {1, 2, 3};
        try{
            System.out.println(arr[4]);// this will generate an error because index 4 doesn't exist index exist is 0 1 2

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        //StringIndexOutOfBound Exception - occurs when we try to access the index of a string that doesn't exist
        String s1 = "Hello";
        try{
            System.out.println(s1.charAt(10)); // index 10 of s1 array doesn't exist
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        //Number format exception - when we try to convert a string into number
        String s2 = "ABC";
        try{
            System.out.println(Integer.parseInt(s2)); // String cannot be converted into number
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
