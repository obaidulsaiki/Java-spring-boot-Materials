import java.util.ArrayDeque;
import java.util.List;

public class ExampleOfArrayDeque {
    public static void Display() {
        //Array deque is the stack and queue combined version
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(1);
        stack.push(23);
        stack.push(3);
        System.out.println(stack);
        // value will be popped from the first
        System.out.println(stack.pop());
        System.out.println(stack);
        // removing first element
        System.out.println("Removing from first: "+stack.removeFirst());
        // removing last element
        System.out.println("Removing from first: "+stack.removeLast());
        // add first element
        stack.addFirst(2);
        // add first element
        stack.addLast(3);
    }
}
