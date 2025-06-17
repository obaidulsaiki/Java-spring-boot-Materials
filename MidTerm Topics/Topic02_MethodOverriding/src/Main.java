import org.w3c.dom.ls.LSOutput;

interface GrandFather{
   public void displayMoney();
   default void unknwonAsset(){
       System.out.println("House");
   }
}
class Father implements GrandFather{

    @Override
    public void displayMoney() {
        System.out.println("I have 1 Million $ as a father");
    }
    public void displayHoney(){
        System.out.println("for kids 20%");
    }
}
class Child01 extends Father{
    public void displayFokir(){
        System.out.println("I am fokir");
    }
}
public class Main {
    public static void main(String[] args) {
        // method overriding happens between child and parent class
        // when 2 method of parent and child class/interface,abstract class is
        // having same and same parameter
        // ------Method overriding --------
        GrandFather gf = new Father();
        gf.displayMoney();
        gf.unknwonAsset();
        // but gf.displayHoney isn't possible as the reference variable is created for GrandFather
        Father f = new Father();
        f.displayHoney();
        f.displayMoney();
        f.unknwonAsset();
        // for child, he can call every method
        Child01 c1 = new Child01();
        c1.displayFokir();
        c1.displayHoney();
        c1.displayMoney();
        c1.unknwonAsset();
    }
}