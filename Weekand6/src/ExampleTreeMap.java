import java.util.TreeMap;

public class ExampleTreeMap {
    public static void display(){
        // tree map is like a map but all trees are shorted/Ordered
        // -> it is Red Black tree( self balancing binary tree)
        TreeMap<String, Integer> friends = new TreeMap<>();
        friends.put("Rifta", 90);
        friends.put("Saiket", 80);
        friends.put("Mariya", 70);
        friends.put("Zinia", 60);
        friends.put("nitus", 50);
        System.out.println(friends);
        System.out.println(friends.get("Zinia"));
        // all like linkedhashedMap.
        // special methods ->
        System.out.println(friends.firstEntry());
        System.out.println(friends.firstKey());
        System.out.println(friends.lastKey());
        System.out.println(friends.floorEntry("Saiket"));
        System.out.println(friends.floorKey("Saikat"));
        System.out.println(friends.ceilingEntry("Saikat"));
        System.out.println(friends.ceilingKey("Saikat"));
        System.out.println(friends.descendingMap());
        System.out.println(friends.descendingKeySet());

    }
}
