package Siaod1;
public class IgorLinkedList {
    private Node head;
    private Node current;
    private int size;

    IgorLinkedList(int size) {
        this.size = size;
    }

    public void add(Node node) {// c=h=n n=c n=c
        if (node.getMult() != 0) {
            if (head == null) {
                head = node;
                current = head;
            } else {
                current.setNextNode(node);
                current = node;
            }
        }
    }

    void printPoly() {
        current = head;
        while (current != null){
            System.out.printf("%+d(x^%d)",current.getMult(),current.getDegree());
            current = current.getNextNode();
        }
        System.out.println();
    }
    void reset(){
        current = head;
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