public class Main {
    public static void main(String[] args) {
        // design pattern is a common way to use a code
        // There are 7 most important design pattern
        // out of them we are going to discuss dependency inject and Factory injection

        // --------dependency Injection -------------(getting reference through parameter)
        Student s1 = new Student("Saiki",24);
        Department cse = new Department(s1);
        cse.getDepartment();
        //--------factory design pattern-------
        SimFactory simFactory = new SimFactory();
        Sim sim = simFactory.getSim("GP");
        Phone phone = new Phone(sim); // DI through constructor
        phone.makeCall();
        sim = simFactory.getSim("ROBI");
        phone = new Phone(sim);
        phone.makeCall();



    }
}
