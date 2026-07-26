class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class InsertLinkedList {

    static Node insertFirst(Node head, int data) {  // Insert At beginning.

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = insertFirst(head, 5);

        print(head);
    }
}
