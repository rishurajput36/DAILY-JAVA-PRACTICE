// Queue Using Stacks 
import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

  
    void enqueue(int data) {
        stack1.push(data);
    }

    int dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

   
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

  
    int peek() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

   
    boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue Front: " + q.peek());

        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());

        System.out.println("Queue Front: " + q.peek());

        q.enqueue(50);

        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());

        System.out.println("Is Queue Empty: " + q.isEmpty());
    }
}