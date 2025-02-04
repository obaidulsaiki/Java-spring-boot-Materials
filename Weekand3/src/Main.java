//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //weekend -- 3
        // pyramid pattern
        Pttrn p1 = new Pttrn();
        p1.pyramidPattern(4);
        /* why java is not pure oop?
        java isn't pure oop because
        1. it supports primitives data type.
        2. Java also supports static methods which can be called without creating object.
        3. java allows direct operation(addition , subtraction, division and multiplication) between primitives datatypes.*/
        //type casting(2)
        TypeCasting tc = new TypeCasting();
        tc.display();
        //wrapper class
        WrapperClass wc = new WrapperClass();
        wc.display();
        //abstract class
        AbstractClass ac = new AbstractClass();
        ac.display();
        // enum
        EnumClass ec = new EnumClass();
        ec.display();

    }
}