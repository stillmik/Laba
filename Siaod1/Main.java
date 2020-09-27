package Siaod1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the polynomial P");
        IgorLinkedList listP = new IgorLinkedList(enterDegree());
        enterMult(listP);
        System.out.println("Enter the polynomial Q");
        IgorLinkedList listQ = new IgorLinkedList(enterDegree());
        enterMult(listQ);
        listP.printPoly();
        listQ.printPoly();
        System.out.println("Method equality(P,Q):" + equality(listP, listQ));
        System.out.println("Enter the X");
        int x =enterX();
        System.out.printf("P=%d, if x = %d\n\n", meaning(listP, x), x);
        System.out.println("Method Add(P,Q,R): ");
        Add(listP, listQ).printPoly();
    }

    private static int enterDegree() {
        System.out.println("Enter the degree");
        Scanner in = new Scanner(System.in);
        int size;
        do {
            while (!in.hasNextInt())
                in.next();
            size = in.nextInt();
        } while (size < 0);
        return size;
    }

    private static int enterX(){
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt())
            in.nextInt();
        return in.nextInt();
    }

    private static void enterMult(IgorLinkedList list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the multiplier");
        for (int i = list.getSize(); i >= 0; i--) {
            while (!in.hasNextInt())
                in.next();
            list.add(new Node(i, in.nextInt()));
        }
        list.setSize(list.getHead().getDegree());
    }

    private static boolean equality(IgorLinkedList list_1, IgorLinkedList list_2) {
        if (list_1.getSize() != list_2.getSize() || list_1.getSize() == 0 || list_2.getSize() == 0)
            return false;
        else {
            list_1.reset();
            list_2.reset();
            while (list_1.getCurrent() != null) {
                if (list_1.getCurrent().getDegree() != list_2.getCurrent().getDegree() || list_1.getCurrent().getMult() != list_2.getCurrent().getMult())
                    return false;
                list_1.setCurrent(list_1.getCurrent().getNextNode());
                list_2.setCurrent(list_2.getCurrent().getNextNode());
            }
            return true;
        }
    }

    private static int meaning(IgorLinkedList list, int x) {
        list.reset();
        int sum = 0;
        while (list.getCurrent() != null) {
            sum += (int) (list.getCurrent().getMult() * Math.pow(x, list.getCurrent().getDegree()));
            list.setCurrent(list.getCurrent().getNextNode());
        }
        return sum;
    }
    private static IgorLinkedList Add(IgorLinkedList list_1, IgorLinkedList list_2) {
        list_1.reset();
        list_2.reset();
        Node current_1 = list_1.getCurrent();
        Node current_2 = list_2.getCurrent();
        IgorLinkedList list_3 = new IgorLinkedList(Math.max(list_1.getSize(), list_2.getSize()));
        while (current_1 != null || current_2 != null) {
            if (current_1 == null) {
                list_3.add(new Node(current_2.getDegree(), current_2.getMult()));
                current_2 = current_2.getNextNode();
            } else if (current_2 == null) {
                list_3.add(new Node(current_1.getDegree(), current_1.getMult()));
                current_1 = current_1.getNextNode();
            } else {
                if (current_1.getDegree() > current_2.getDegree()) {
                    list_3.add(new Node(current_1.getDegree(), current_1.getMult()));
                    current_1 = current_1.getNextNode();
                } else if (current_1.getDegree() == current_2.getDegree()) {
                    list_3.add(new Node(current_1.getDegree(), current_1.getMult() + current_2.getMult()));
                    current_1 = current_1.getNextNode();
                    current_2 = current_2.getNextNode();
                } else if (current_2.getDegree() > current_1.getDegree()) {
                    list_3.add(new Node(current_2.getDegree(), current_2.getMult()));
                    current_2 = current_2.getNextNode();
                }
            }
        }
        return list_3;
    }
}