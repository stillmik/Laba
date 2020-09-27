package Siaod4;

public class Quant {
    private int number;
    private Quant next;
    private Quant prev;

    Quant(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Quant getNext() {
        return next;
    }

    public void setNext(Quant next) {
        this.next = next;
    }

    Quant getPrev() {
        return prev;
    }

    void setPrev(Quant prev) {
        this.prev = prev;
    }
}