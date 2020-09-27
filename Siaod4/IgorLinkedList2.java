package Siaod4;

public class IgorLinkedList2 {
    private Quant head;
    private Quant current;

    public void add(Quant unit) {
        if (head == null) {
            current = unit;
            head = unit;
            head.setNext(head);
            head.setPrev(head);
        } else {
            unit.setNext(head);
            unit.setPrev(head.getPrev());
            head.getPrev().setNext(unit);
            head.setPrev(unit);
        }
    }

    public void reset() {
        current = head;
    }

    Quant getHead() {
        return head;
    }

    public void setHead(Quant head) {
        this.head = head;
    }

    Quant getCurrent() {
        return current;
    }

    void setCurrent(Quant current) {
        this.current = current;
    }
}