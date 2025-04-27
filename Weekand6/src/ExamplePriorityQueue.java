import java.util.PriorityQueue;

public class ExamplePriorityQueue {
    public static void display() {
        PriorityQueue<Integer> pq;
        pq = new PriorityQueue<>();
        // Adding value in to the priority queue
        // value is by default set in ascending order
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(1);
        // outputing value of priority queue
        System.out.println(pq);

        //if we directly show and remove the first value of queue
        System.out.println(pq.poll());
        System.out.println("Queue status: " + pq);
        //showing the first value of queue
        System.out.println(pq.peek());
        // size (), remove(), clear(), contains() same
    }
}
