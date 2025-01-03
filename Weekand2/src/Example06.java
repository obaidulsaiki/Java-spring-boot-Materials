public class Example06 {
    protected int age = 3;

    Example06() {
        System.out.println("Default constructor");

    }

    Example06(int a) {
        //this() - is used to go the constructor of same class
        // depending on the parameter the constructor will be called
        this();//it will call example06() . this () indicates default constructor

    }

    public void print1() {
        //this is used to make compiler understand that this variable is from the same class
        System.out.println("Created to show this. - " + this.age);
    }
}

class Example07 extends Example06 {
    Example07() {
        //super is used to call the parent class constructors
        //super(number) will call the Example06(int a) constructor
        //super() will call the default constructor
        super(); // only one explicit constructor call is allowed


    }

    public void print2() {
        //super is used to make compiler understand this variable or method is from the parent class
        System.out.println("Created to show super. - " + super.age);
        super.print1();

    }
}
