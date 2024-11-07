class StringFunction{
    private String s1 = "abba";
    private String s2 = "baab";
    //concatenation
    public void concating()
    {
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
    //finding length
    public void lengthing(){
        System.out.println(s1.length());
    }
    //reverse
    public void reversing(){
        StringBuilder s3 = new StringBuilder();
        s3 = s3.append(s1); //concatenating with s3
        System.out.println(s3.reverse());
    }
    //replacing
    public void replacing(){
        System.out.println("The orginal string was abba:  " + s1.replace("ab", "abba"));

    }
    //trimming
    public void trimming(){
        String s3 = "    abba    ";
        System.out.println(s3.trim());
    }
    //substring
    public void substringing(){
        String s3= "I love JAVA";
        System.out.println("The part of string : "+ s3.substring(0,6));
        System.out.println("prefix of the string : "+ s3.substring(0,2));
        System.out.println("suffix of the string : "+ s3.substring(s3.length()-3,s3.length()-1));

    }

}
public class StringAll {
    public static void  main(String[] args){
    StringFunction obj = new StringFunction();
    obj.concating();
    obj.lengthing();
    obj.replacing();
    obj.trimming();
    obj.reversing();
    obj.substringing();
    }
}
