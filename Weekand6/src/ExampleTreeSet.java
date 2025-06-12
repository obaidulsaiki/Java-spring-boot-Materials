import java.util.TreeSet;

public class ExampleTreeSet {
    public static void Display(){
        // TreeSet is a data structure that stores the data sorted and unique
        TreeSet<String> favActressName = new TreeSet<>();
        favActressName.add("Hania");
        favActressName.add("Durefishan");
        favActressName.add("Yumna");
        favActressName.add("Shajal");
        favActressName.add("Durefishan");// this duplicate value will be not added
        System.out.println(favActressName); // the output also will be alphabetically sorted.
        // the smallest value.
        System.out.println(favActressName.first());
        //the biggest value
        System.out.println(favActressName.last());
        // if we want to find value after a string
        System.out.println(favActressName.higher("Yumna"));
        // if we want to find value before a string
        System.out.println(favActressName.lower("Hania"));
        // value between the strings
        System.out.println(favActressName.subSet("Hania","Yumna")); // the output will contain the first value


    }
}
