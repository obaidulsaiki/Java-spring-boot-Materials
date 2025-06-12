import java.util.ArrayList;
import java.util.List;

public class ExmpleOfLst {
    public static void display() {
        List<String> list = new ArrayList<String>();
        //Add function to add same type elements
        list.add("Amar");
        list.add("shonar");
        list.add("Bangla");
        list.add("Ami");
        list.add("tumay");
        list.add("bhalobashi");
        System.out.println(list);
        // Adding on particular index
        list.add(5,"ExmpleOfLst"); // 5 means 5th elements
        System.out.println(list);
        //set an element
        list.set(5, "TUMI AMI");
        System.out.println(list);
        // removing One index value
        list.remove(5);
        System.out.println(list);
        // size of the list
        System.out.println(list.size());
        //checking if value exist
        System.out.println(list.contains("Amar"));
        // Check if the List is empty or not
        System.out.println(list.isEmpty());
        // foreach to iterate
        list.forEach(lembda -> System.out.println("False"));
        //Clearing list
        list.clear();
        System.out.println(list);



    }
}
