// we want to create a user defined exception where if there is an odd number, it will generate an error
// In a project all the things that requires validation will be checked with exception.

//importing all class of util library to use user input
import java.util.*;
class OddNumberException extends Exception{
    OddNumberException(String msg){
        super(msg);
    }
}
public class UserDefinedException {
    public static void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int a = sc.nextInt();
        //if the number is odd through exception
        try{
            if(a%2==1)
            {
                throw new OddNumberException("Exception!!! This is an odd number");
            }
            else{
                System.out.println("This is an Even number");
            }
        }
        catch(OddNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
