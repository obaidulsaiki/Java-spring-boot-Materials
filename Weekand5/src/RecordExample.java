// Record Special type of class used as a data carrier Design to store immutable (NOT CHANGABLE)
// reduce boilerplate code
// without Record we have to use Constructor to initialize, equal function and to string function
// arrived in java 14
// A record should have name with the ending DTO = data transfer object
// Syntax record classnameDTO (parameter) { }
record ExampleDTO(String name, int age) { // canonical constructor automatically generated
    // To string, Equal and hashcode also automatically generated
    // All variable will be final and static
    // cannot extend other class
    public static final int EXAMPLE_NO_AGE = 18;
    // Compact constructor only available in Record:
    public ExampleDTO{
        try{
            if(age < EXAMPLE_NO_AGE){
                throw new IllegalArgumentException("Age must be greater than 18");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}
public class RecordExample {
    public static void display() {
        ExampleDTO example = new ExampleDTO("John", 17);
        System.out.println(example);
        System.out.println(example.toString()); // same as example
        System.out.println(example.hashCode()); // generate a unique number for an object
        System.out.println(example.equals(new ExampleDTO("John", 17)));// check if the objects are equal
    }
}
