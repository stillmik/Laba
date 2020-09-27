package Siaod3;

public class Node {
    private String Fullname;
    private long number;
    private Node next;

    public Node(String Fullname, long number) {
        this.Fullname = Fullname;
        this.number = number;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        this.Fullname = fullname;
    }

    long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
