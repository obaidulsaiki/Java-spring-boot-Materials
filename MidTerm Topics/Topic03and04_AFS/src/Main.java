abstract class Example01{
    // an abstract class is a class where method will not have any body
    // the method will be written with the keyword abstract
    // except abstract method there can be normal method with body too
    public static int exampleTime = 60;
    abstract public void display();
    public void normal(){
        System.out.println("This is normal");
    }
}
// the difference between abstract class and Interface is
// (1.1) abstract class can have both abstract methods and method with body
// (1.2)  interface could only have abstract methods after java 8 interface have default method
//        (default method is written with default keyword and body)
// (2.1) abstract class have any types of field
// (2.2) interface can have only public static final types field
// (3.1) Abstract class is extended by another class
// (3.2) Interface is implemented by another class

class child extends Example01{

    @Override
    public void display() {
        System.out.println("This is from the child");
    }
}
public class Main {
    public static void main(String[] args) {

        Example01 e1 = new child();
        e1.display();
        e1.normal();
        final int number =1;
        System.out.println(number);
        // the below will be error as final key word is used to give value only 1 time
        // final int number =3;
        // the static variable can be called directly with classname if public,default
        System.out.println(Example01.exampleTime);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}