package Siaod2;

public class Node {
    private int num;
    private Node nextNode;

    Node(int num){
        this.num = num;
    }

    int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}