public class StaticTacker {
    //static variable A normal variable declared with static keyword
    static int age =12;
    //static variable A normal method declared with static keyword
    static void printingSt()
    {
        System.out.println("Hello For static calling");
    }
    //Static blocks - called at the time of THE CLASS call
    static
    {
        System.out.println("THis is Static Block");
    }
    //inner class - class inside class
    public class InsideClass{
        public void display(){
            System.out.println("This is inner class ");
        }
    }

}
