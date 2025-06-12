import java.util.HashSet;
import java.util.Set;

public class ExmplHashset {
    public static void display(){
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        //printing what is inside the set
        System.out.println(set);
        // check if the set is empty or not
        System.out.println(set.isEmpty());
        // finding the number of elements inside the set
        System.out.println(set.size());
        //check if hashset has the value or not
        System.out.println(set.contains("A"));
        // remove , clear looping same as Example array
        //Set Implementation
        //Set<String>s = new HashSet<>();


    }
}
