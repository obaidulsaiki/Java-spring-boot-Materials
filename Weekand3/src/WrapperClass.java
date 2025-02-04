public class WrapperClass {
    public void display() {
        // Wrapper class are provided by java to use primitives data types as an object.
        // byte - Byte, short - Short, int - Integer, long - Long, float - Float, Char - Character
        // double - Double , boolean - Boolean
        Integer i = 12;
        // java automatically converts between primitives and wrapper class this is autoboxing
        int i1 = i;
        System.out.println("Integer  : " + i + ", " + i1);
        Character c = 'A';
        System.out.println("The value of Char : "+ c.charValue());
    }
}
