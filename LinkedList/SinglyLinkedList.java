// "static void main" must be defined in a public class.
public class SinglyLinkedList {

    static Node head;
    static int size;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted at Head is completed");
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at Head is completed");
        size++;

    }

    public static void insertTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("Inserted at Tail is completed");
            size++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println("Inserted at Tail is completed");
        size++;

    }

    public static void insertAtAnyPosition(int data, int pos) {
        if (pos == 1) {
            insertHead(data);
            return;
        }
        if (pos == size + 1) {
            insertTail(data);
            return;
        }

        Node temp = head;
        int count = 0;

        while (count <= pos - 2) {
            temp = temp.next;

        }

        Node newNode = new Node(data);

        newNode.next = temp.next.next;
        temp.next = newNode;
        System.out.println("Inserted at " + pos + " is completed");
        size++;
        return;
    }

    public static void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->" + " ");
            temp = temp.next;
        }
    }

    public static void deleteAtHead() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        head = head.next;
        System.out.println("Head is deleted.");
        size--;
    }

    public static void deleteAtTail() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        System.out.println("Deletion at tail is completed");
        size--;
    }

    public static void deleteAtAnyPosition(int pos) {
        if (pos == 1) {
            deleteAtHead();
            return;
        }

        if (pos == size) {
            deleteAtTail();
            return;
        }

        Node temp = head;
        int count = 0;

        while (count < pos - 2) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        System.out.println("Element is deleted at position " + pos);
        size--;
    }

    public static void updateAtAnyPos(int pos, int data) {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        int count = 0;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }

        temp.data = data;
        System.out.println("Value is updated");
    }

    public static int position(int data) {
        if (head == null) {
            System.out.println("LL is empty");

        }

        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == data) {
                return pos;
            }
            temp = temp.next;
            pos++;
        }

        return -1;
    }

    public static void main(String[] args) {
        insertHead(1);
        print();
        insertTail(2);
        print();
        insertHead(3);
        print();
        updateAtAnyPos(2, 70);
        print();
        int pos = position(2);
        System.out.println(pos);

    }
}