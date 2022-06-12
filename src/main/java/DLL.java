public class DLL {
    Node head;
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }
    
    //Remove the last node from the DLL
    void pop() {
        if (this.head != null) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                Node temp = new Node(0);
                temp = this.head;
                while (temp.next.next != null)
                    temp = temp.next;
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
            }
        }
    }

    //Insert node at the start of the DLL
    public void push(int new_data) {
        Node new_Node = new Node(new_data);

        new_Node.next = head;
        new_Node.prev = null;

        if (head != null)
            head.prev = new_Node;
        head = new_Node;
    }

    //Prints DLL
    public void printlist(Node node) {
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
    }

    //How many nodes exist, returned as an integer
    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}