public class ConstructorClass {
    ConstructorClass()
    {
        System.out.println("This is default constructor");
    }
    ConstructorClass(int a , int b){
        int sum = a+b;
        System.out.println("Sum of the value passed: "+ sum);

    }
    ConstructorClass(ConstructorClass cc1)
    {
        System.out.println("Just for copy constructor show ");
    }
}
