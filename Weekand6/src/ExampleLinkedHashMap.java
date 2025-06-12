import java.util.LinkedHashMap;

public class ExampleLinkedHashMap {
    public static void display(){
        // Stores key value paired Easily we can  Hashmap that remembers the order
        LinkedHashMap<String, Integer> Subjects = new LinkedHashMap<>();
        Subjects.put("math", 99);
        Subjects.put("higherMath", 99);
        Subjects.put("Science", 99);
        Subjects.put("physics", 99);
        // the value will be added serially
        System.out.println(Subjects);
        System.out.println("What is the number in math? " + Subjects.get("math")); // 99
        // removing a value
        Subjects.remove("higherMath");
        System.out.println(Subjects);
        // check if key exist
        System.out.println(Subjects.containsKey("math")); // true
        System.out.println(Subjects.containsValue(90)); // true
        System.out.println(Subjects.size()); // size
        System.out.println(Subjects.isEmpty()); // ccheck if the ds is empty
        System.out.println(Subjects.values()); // returns all value
        }
}
