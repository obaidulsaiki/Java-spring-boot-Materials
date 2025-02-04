// abstract  means not clear. abstract method can be used in an abstract class
//abstract methods refers to method having definition but no implementation
abstract class example{
    abstract public void show();
    public void show2(){
        System.out.println("Abstract class normal function");
    }
}
class One extends example{

    @Override
    public void show() // definition
    {
        System.out.println("example one");
    } // implementation
}
public class AbstractClass {
    public void display(){
        One o1 = new One();
        o1.show();
        // abstract class  doesn't provide 10% abstraction because we can declare method with implementation in abstract class
        // The implemented abstract methods are not necessary to override
        o1.show2();

    }
}
