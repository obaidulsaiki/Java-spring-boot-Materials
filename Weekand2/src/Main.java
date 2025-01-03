//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //encapsulation with setter getter
        EncapsulationClass ec = new EncapsulationClass();
        ec.setName("Bishamon");
        ec.setAge(340);
        System.out.println("Name: " + ec.getName() + "\nAge: " + ec.getAge());
        //constructor 3 types default, parameterized, copy
        ConstructorClass cc1 = new ConstructorClass(); // calling default constructor
        cc1 = new ConstructorClass(2, 3);//parameterized constructor
        // if we declare only a parameterized constructor we need a default constructor
        ConstructorClass cc2 = new ConstructorClass(cc1);// passing instance of the object
        //when we don't creat object and directly call with the instance is called anonymous object
        new AnonymusObjectEx().display();
        // inheritance - child class , parent class. child class can extend all the property of the parent class
        // inheritance 4 types
        //1. singe A to B
        InheritanceParent sipc = new InheritanceParent();
        sipc.display();
        sipc.show1();
        InheritanceClassChild icc = new InheritanceClassChild();
        icc.show1();
        icc.show2();
        //2. multi-level  A to B to C
        InheritanceClassGrandChild icg = new InheritanceClassGrandChild();
        icg.show1();
        icg.show2();
        icg.show3();

        //3. Hierarchical A to B, A to C
        InheritanceChild1 c1 = new InheritanceChild1();
        c1.show1();
        c1.display1();
        InheritanceChild2 c2 = new InheritanceChild2();
        c2.show1();
        c2.display2();
        //4. multiple  A to C , B to C (Not possible yet in java) possible with interface
        //This, super, super(),this()
        Example06 e6 = new Example06(2);
        Example07 e7 = new Example07();
        e6.print1();
        e7.print2();
        // polymorphism
        //1.method overloading - same function name different parameter (Early Binding, compiler time polymorphism)
        MthdOverldingClass moc = new MthdOverldingClass();
        moc.function();
        moc.function(1, 2);
        moc.function(1, 2, 3);
        //2. Method overriding - same function name same parameter (late Binding, runtime time polymorphism)
        MethodOverridingClass meoc = new MethodOverridingClass();
        meoc.displayM();
        meoc = new ChildCLass();
        meoc.displayM();
        // object class is the root class from all the class is derived in java
        // method dispatcher in java is when to call which function . same as polymorphism concept

        //final keyword - makes variable constant , variable is written in Capital letters
        final String VARIABLE = "This is final";


    }
}