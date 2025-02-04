// Interface is a concept like abstract class, but it provides true abstraction
// There will be no method with implementation. We also cannot create instance of interface
// To connect with the concept of inheritance A class implements an interface
interface Example {
    //we can also declare variable in interface
    // the variable should be final and static.
    int age = 12;
    // methods without implementations must override
    void display();
    // After java 8 there is default method and static method in interface
    // not necessary to override
    default void display1(){
        System.out.println("Inherited by ALL");
    }
}
class ExampleClass implements Example{

    @Override
    public void display() {
        System.out.println("This is the example class module" + age);
    }
}
// Class Extends class
// interface extends interface
// class implements interface
public class interfaceClass {
    public static void show(){
        ExampleClass ec = new ExampleClass();
        ec.display();
        ec.display1();
    }
}
