class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MergedTwoSortedLinkList {

    static Node merge(Node l1, Node l2) {

        // Handle empty lists
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        // Choose starting head
        Node head;

        if(l1.data <= l2.data) {
            head = l1;
            l1 = l1.next;
        } 
        else {
            head = l2;
            l2 = l2.next;
        }

        Node temp = head;

        // Merge remaining nodes
        while(l1 != null && l2 != null) {

            if(l1.data <= l2.data) {
                temp.next = l1;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        // Attach remaining nodes
        if(l1 != null)
            temp.next = l1;

        else
            temp.next = l1;


        return head;
    }


    public static void main(String[] args) {

        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);


        Node result = merge(l1,l2);

        while(result != null) {// print to list
            System.out.print(result.data+" ");
            result=result.next;
        }
    }
}