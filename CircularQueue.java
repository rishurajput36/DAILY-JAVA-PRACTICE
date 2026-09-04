// Circular Queue using Linked List
public class CircularQueue {

  
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

  
    void enqueue(int data) {

        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            rear.next = front;
        } 
        else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

   
    int dequeue() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = front.data;

     
        if (front == rear) {
            front = rear = null;
        } 
        else {
            front = front.next;
            rear.next = front;
        }

        return value;
    }

   
    int peek() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

  
    void display() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue:");
        q.display();

        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());

        System.out.println("Queue after deletion:");
        q.display();

        q.enqueue(50);
        q.enqueue(60);

        System.out.println("Queue after insertion:");
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}