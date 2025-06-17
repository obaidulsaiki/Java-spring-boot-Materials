public class Student {
    private String name;
    private int age;
    // here dependency injection is done with using constructor
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    // using setter method we can also set the value from the parameter like this:

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public String Display() {
        return "This student name: " + name;
    }
}
class Department{
    private Student student;
    public Department(Student student){
        this.student = student;
    }
    public void getDepartment(){
        System.out.println(student.Display() + " From CSE");
    }
}
// dependency injection can be done in 3 ways
// 1. using constructor
// 2. using setter method
// 3. using interface injection