public class InheritanceParent {
    //variables
    int number = 12;

    public void display() {
        System.out.println("Showing the number" + number);
    }

    public void show1() {
        System.out.println("This is parent Class");
    }
}

// parent class extended by child class (single inheritance)
class InheritanceClassChild extends InheritanceParent {
    public void show2() {
        System.out.println("This is Child class");
    }
}
// parent clas extended by child extended by grandchild class (MultiLevel)
class InheritanceClassGrandChild extends InheritanceClassChild {
    public void show3() {
        System.out.println("This is Grand Child class");
    }
}
//parent class extended by child1 and child2
class InheritanceChild1 extends InheritanceParent{
    public void display1()
    {
        System.out.println("This is first child");
    }
}class InheritanceChild2 extends InheritanceParent{
    public void display2()
    {
        System.out.println("This is Second child");
    }
}
