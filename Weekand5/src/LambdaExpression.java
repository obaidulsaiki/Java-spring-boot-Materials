// lambda expression is a concept in java that is used to reduce boilerplate code.
//It works only if there is Functional Interface. (Interface with only one function.)

// Without return type and without parameter
interface Example1{
    void show();
}
//without return type and parameter
interface Example2 {
    void show(int i);
}
// with return type and without parameter
interface Example3{
    int show();
}interface Example4{
    int show(int i, int j);
}
public class LambdaExpression {
    public static void display(){
        //that's how we can create interface object by directly assigning the function in the parameter
        Example1 e1 = new Example1() {
            @Override
            public void show() {
                System.out.println("THIS IS THE NeW");
            }
        };
        e1.show();
        // Using Lambda Expression we can simplify it by (Parameter) -->{Expression}
        // without using return type -------------------------------------------------------------
        // if one line we don't need braces
        Example1 e2 = () -> System.out.println("This is the new New with Lambda");
        e2.show();
        Example1 e3 = () -> {System.out.println("This is the new New with Lambda and" );
            System.out.println("Multiple line"); };
        e3.show();

        // With a parameter and without return type. In the parameter it is not needed to declare datatype
        Example2 e4 = (i) -> System.out.println("The number to print "+ i);
        e4.show(5);

        // without a parameter and with a return type // we don't need to mention return keyword
        Example3 e5 = () -> 2;
        System.out.println("The number to be printed: " + e5.show());

        // with parameter and with a return type
        Example4 e6 = (i,j) -> i+j;
        System.out.println("The summation : " + e6.show(5,6));
    }
}
