// Using Queue Interface with LinkedList
import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        System.out.println("Front element: " + queue.peek());

     
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removal: " + queue);
    }
}