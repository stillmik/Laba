package Siaod3;

public class IgorLinkedList {
    private Node head;
    private Node current;
    private int size;

    public void add(Node node) {
        reset();
        if (size == 0) {
            head = node;
            current = node;
            size++;
        } else if (node.getFullname().compareTo(head.getFullname()) <= 0) {
            node.setNext(head);
            head = node;
            size++;
        } else {
            while (current.getNext() != null && node.getFullname().compareTo(current.getNext().getFullname()) > 0)
                current = current.getNext();
            if (current.getNext() == null) {
                current.setNext(node);
                node.setNext(null);
                size++;
            } else {
                node.setNext(current.getNext());
                current.setNext(node);
                size++;
            }
        }
        reset();
    }

    void reset() {
        current = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    Node getCurrent() {
        return current;
    }

    void setCurrent(Node current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}