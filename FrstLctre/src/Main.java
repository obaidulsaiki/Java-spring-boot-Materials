//implementing basic class & object
class example01{
    //Attributes
    private String name;
    //methods

    //Constructor
    public example01(){
        System.out.println("CONSTRUCTOR IS CALLED");//called after static block
    }
    //# setter
    public void Setname(String name){
        this.name = name;
    }
    //#getter
    public String getname(){
        return name;
    }
    //static blocks : stay with the class when the class is called it is called automatically
    static{
        System.out.println("This is static Block");
    }





    //inner class
    public class insideExmpl{
        public void prntng()
        {
            System.out.println("This is printed from the inner class");
        }
    }


}
public class Main {
    public static void main(String[] args) {
    example01 e1 = new example01();
    e1.Setname("Sharjeena");
    System.out.println("Name: " + e1.getname());
    //calling inner class
    example01.insideExmpl i1= e1.new insideExmpl();
    i1.prntng();
    }
}