import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

public class ExmpleOfLinkedList {
    public static void display(){
        // in java Linked list works like doubly linked list.
        // Adding value in LinkedList is faster compare to arrayList
        //  Difficulty and slow in case of searching compare to arrayList
        // but requires more memory
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        System.out.println(ll);
        System.out.println("Value 1 exist ? " + ll.get(1));
        System.out.println("The first value ? " + ll.getFirst());
        System.out.println("The last value ? " + ll.getLast());
        // adding value at first
        ll.addFirst(7);
        // adding value at last
        ll.addLast(6);
        System.out.println(ll);
        // adding elements directly
        LinkedList<String> animal = new LinkedList<>(Arrays.asList("cat","cow", "dog"));
        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("cow"));
        // removing some value
        animal.removeAll(animalToRemove);
        System.out.println(animal);
        //making linkedList unique we need to use Set version of Linked list which is LinkedHashSet
    }
}
