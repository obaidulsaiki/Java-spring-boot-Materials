// class to highlight method overloading (same method name different parameter number or type)
class Example1{
    public void print(){
        System.out.println("print function with 0 param");
    }
    public void print(int i){
        System.out.println("print with 1 param : " + i);
    }
    public void print(String s){
        System.out.println("print with 1 param : " + s);
    }
    public void print(int a,int b){
        System.out.println("print with 2 param : " + a +","+ b);
    }
}
class Example02{
    public Example02(){
        System.out.println("THis is the default constructor");
    }
    public Example02(int i, int j){
        System.out.println("The number 1 : " + i  + "," + j);
    }public Example02(String messege){
        System.out.println("The messege is: " + messege);
    }
    public Example02(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        //polymorphism is one of the four pillar of Object-Oriented Programming (OOP)
        // polymorphism is categorized as method overloading , method overriding
        // method overloading is naming multiple method as a same name but parameter is different
        // method overloading happens inside one class
        //---------Method Overloading -----------------
        Example1 e1 = new Example1();
        e1.print();
        e1.print(1);
        e1.print("Fokinnis");
        e1.print(2,3);
        //--------Constructor Overloading -------
        // Constructor is a special type of method that calls automatically
        // when the object is initialized
        // constructor can also be overloaded by applying different parameter
        Example02 e2;
        e2 = new Example02();
        e2 = new Example02(12,13);
        e2 = new Example02("This is param3");
        e2 = new Example02("Saiki", 26);


    }
}