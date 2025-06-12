import java.util.ArrayList;
import java.util.Collections;
public class ExmpleArray {
    public static void display(){
        ArrayList<String> list = new ArrayList<String>();
        //adding elements in the arrayList
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        //Adding elements according to the index
        list.add(0,"D");// here D will be stored in the 0 index
        System.out.println(list);
        //elements can be accessed using the index
        System.out.println(list.get(0));
        // to get the size
        System.out.println(list.size());
        // loop through the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + " Value: " + list.get(i));
        }
        // for each loop
        for(String e: list){
            System.out.println(e);
        }
        // to sort the arraylist we need to first import collection
        Collections.sort(list);
        System.out.println(list);
        // check if a string or value exist or not
        System.out.println(list.contains("a"));
        // remove all the elements is done using clear function
        list.clear();
        System.out.println(list);

    }
}
