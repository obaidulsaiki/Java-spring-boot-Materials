// generic is a concept that means making a variable universal data type.
// Normally we cannot send any type of object through any parameter
// By using generics we can use a function for any type of object
// reduce code
// we declare the type with <T> - refers to any type. Whe can write <WHatever> .
class GenExmple <T>{
    private T Object;
    GenExmple(T Object){
        this.Object = Object;
    }
    public void print()
    {
        System.out.println("OUTPUT: " + this.Object);
    }
}
public class JavaGeneric {
    public static void display(){
        // In the declaration the type should be like wrapper class , primitives class doesn't work
        GenExmple<Integer> i = new GenExmple<>(23);
        i.print();
        GenExmple<String> st = new GenExmple<>("Johan Albert");
        st.print();
        GenExmple<Double> db = new GenExmple<>(23.77);
        db.print();
        //by using generic we can use different type of parameter and use the same class reducing boilerplate

    }
}
