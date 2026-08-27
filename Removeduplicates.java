// Remove Duplicates from Linked List

class RemoveDuplicates {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

  
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

  
    public void removeDuplicates() {

        if (head == null) {
            return;
        }

        Node current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        RemoveDuplicates list = new RemoveDuplicates();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println("Before removing duplicates:");
        list.printList();

        list.removeDuplicates();

        System.out.println("After removing duplicates:");
        list.printList();
    }
}