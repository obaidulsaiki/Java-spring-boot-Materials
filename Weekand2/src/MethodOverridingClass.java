public class MethodOverridingClass {
    public void displayM(){
        System.out.println("THis is parent");
    }
}
class ChildCLass extends MethodOverridingClass{
    public void displayM(){
        System.out.println("THis is child");
    }
}
