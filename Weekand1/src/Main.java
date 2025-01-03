public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        //to call static variable and function.
        // static things is binded with the class.
        //normal class and object
        ExClassAndObject eco = new ExClassAndObject();
        eco.show();
        StaticTacker.printingSt(); // the static block will be called here
        System.out.println("Output: " +StaticTacker.age);
        // declaring object
        //className referenceVariable = new instance declaration;
        StaticTacker st = new StaticTacker();
        //StaticTacker has an inner class to call:
        // ParentClass.innerclass reference variable = ParentObject.new Innerclass();
        StaticTacker.InsideClass ic = st.new InsideClass();
        ic.display();
        //dataTypes
        DataTypes dt = new DataTypes();
        //string operation
        StringManipulation obj = new StringManipulation();
        obj.concatenating();
        obj.lengthening();
        obj.replacing();
        obj.trimming();
        obj.reversing();
        obj.substringing();
    }
}