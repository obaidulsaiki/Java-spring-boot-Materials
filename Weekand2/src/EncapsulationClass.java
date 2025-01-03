public class EncapsulationClass {
    /*Encapsulation is a protective shield that prevents the data from being accessed by the code outside this shield. (binds method attribute together */
    private String Name;
    private int Age;

    //setter - user to set value
    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        //this is used when the variable of class and parameter is same. Used to defined this variable belong o this class
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
}
