package Chaining;

public class Chain {


    private Node head;

    private Node tail;

    public Chain() {
        head = null;
        tail = null;
    }


    void insertToTail(int x) {
        Node added = new Node(x);

        if (head == null) {
            head = added;
            tail = head;
        } else {
            tail.next = added;
            tail = tail.next;
        }
    }

    void insertToHead(int x) {
        Node added = new Node(x);
        if (head == null) {
            head = added;
            tail = head;
        } else {
            tail.next = added;
            tail = tail.next;
        }
    }


    boolean delete(int x) {
        if (head == null) {
            return false;
        }


        if (head.data == x) {
            head = head.next;
            return true;
        } else {
            Node curr = head;

            while (curr.next != null) {
                if (curr.next.data == x) {
                    curr.next = curr.next.next;
                    return true;
                }
                curr = curr.next;
            }
            return false;

        }

    }

    boolean search(int x) {

        if (head == null) {
            return false;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }
}
