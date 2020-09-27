package Siaod1;
public class Node {
    private int degree;
    private int mult;
    private Node nextNode;

    Node(int degree, int mult) {
        this.degree = degree;
        this.mult = mult;
    }

    int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    int getMult() {
        return mult;
    }

    public void setMult(int mult) {
        this.mult = mult;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}