public class MthdOverldingClass {
    //same name differnet parameter
    public void function(){
        System.out.println("Variable is 0");
    }
    public void function(int a , int b)
    {
        System.out.println("Variable is "+a+"and"+b);
    }
    public void function(int a, int b, int c)
    {
        System.out.println("Variable is "+a+"and"+b + "and"+ c);
    }
}
