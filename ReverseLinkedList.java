class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseLinkedList {

    static Node rev(Node head) {

        Node p = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = p;
            p = curr;
            curr = next;
        }

        return p;
    }

    public static void main(String args[]) {

        Node f = new Node(10);
        Node s = new Node(20);
        Node t = new Node(30);
        
        f.next = s;
        s.next = t;
        t.next=fo;

        f = rev(f);

        Node temp = f;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}