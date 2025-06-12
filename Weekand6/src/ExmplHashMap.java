import java.util.HashMap;
import java.util.Map;

public class ExmplHashMap {
    public static void  display(){
        // Map is a datatype that has key and value of the key
        // key value pair
        // doesnt have any particular value, key will be unique
        HashMap<Integer, String> hmp = new HashMap<>();
        //to add value:
        hmp.put(1, "Batman");
        hmp.put(2,"spiderman");
        hmp.put(3,"Superman");
        // print hashMap
        System.out.println(hmp);
        // print keys and value
        for(int i : hmp.keySet()){
            System.out.println("the value of Key: "+ i);
            System.out.println("the value: "+ hmp.get(i));
        }
        // to make the value uppercase
        System.out.println(hmp.get(2).toUpperCase() );
        // to make the value lowercase
        System.out.println(hmp.get(2).toLowerCase() );
        // check if the key is there or not
        System.out.println(hmp.containsKey(1));
        // check if the value is there or not
        System.out.println(hmp.containsValue("Batman"));
        // we can also remove value using key
        System.out.println(hmp.remove(1));
        // we can also check if the key-value is deleted
        System.out.println(hmp.remove(1,"Batman"));

    }
}
// internal Structure of HashMap
/*
 * There are  4 components of HashMap :
 * 1) Key - key is the unique identifier of value
 * 2) Value - the value stored in opposite of key
 * 3) Bucket - the data of hashmap stored in ARRAY.
 * 4) Hash function - the key goes to hash function and according to the key it retrieve the
 * index from the array used to store the values.
 * when we put key --> generate hashcode --> determine where the value will store inside the array
 *
 *
 *
 * */