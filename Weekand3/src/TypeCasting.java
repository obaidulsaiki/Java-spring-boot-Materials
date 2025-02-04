class Animal {
    public void display1(){
        System.out.println("THIS CLASS IS ANIMAL");
    }
}
class Dog extends Animal{
    public void display2(){
        System.out.println("THIS CLASS IS FOR DOG");
    }
}

public class TypeCasting {
    public void  display()
    {
        //type casting 2 types 1. primitiveType casting and 2. ObjectType casting
        int it = 14;
        double db = 12.56;
        // 1. Primitive Type casting 2 types
        // Lower to higher data type sequence : Byte->short->int->long->float->double
        // 1.1. implicit type casting : Automatically done by the compiler from lower to higher data types
        double temp = it;
        // 1.2. Explicit type casting : Manually done by typing data type for converting higher data types to lower
        int a = (int) db;
        System.out.println("Implicit type casting from "+it+" to "+temp);
        System.out.println("Explicit type casting from "+db+" to "+a);
        // 2. Object types casting 2 types
        // 2.1. Upcasting : Assigning a child class to parent class
            Dog ani = new Dog();
            ani.display1(); // display 2 isn't accessible for ani

        // 2.2. Down-casting: Assigning a parent class to child class
            Dog d = ani;
            d.display2();

    }
}
