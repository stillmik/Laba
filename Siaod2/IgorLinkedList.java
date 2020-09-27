package Siaod2;

public class IgorLinkedList {
    private Node head;
    private Node current;
    private int size;

    public void add(Node node) {
        if (size == 0) {
            head = node;
            current = node;
            size++;
        } else {
            current.setNextNode(node);
            node.setNextNode(head);
            current = current.getNextNode();
            size++;
        }
    }

    void delete() {
        if (current.getNextNode() == head) {
            current.setNextNode(head.getNextNode());
            head = current.getNextNode();
            size--;
        } else {
            current.setNextNode(current.getNextNode().getNextNode());
            size--;
        }
    }

    void reset() {
        current = head;
    }

    IgorLinkedList() {
        size = 0;
    }

    Node getHead() {
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