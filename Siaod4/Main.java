package Siaod4;

public class Main {
    public static void main(String[] args) {
        IgorLinkedList2 list2 = new IgorLinkedList2();
        initData(list2);
        do {
            System.out.println(list2.getCurrent().getNumber());
            list2.setCurrent(list2.getCurrent().getNext());
        } while (list2.getCurrent() != list2.getHead());
        System.out.println();
        IgorLinkedList list = new IgorLinkedList();
        list2.setCurrent(list2.getHead().getPrev());
        do {
            if (list2.getCurrent().getNumber() > 999)
                list.add(new Node(list2.getCurrent().getNumber()));
            list2.setCurrent(list2.getCurrent().getPrev());
        } while (list2.getCurrent() != list2.getHead().getPrev());

        list.reset();
        System.out.println("Новый список:");
        do {
            System.out.println(list.getCurrent().getNumber());
            list.setCurrent(list.getCurrent().getNext());
        } while (list.getCurrent() != null);
    }

    private static void initData(IgorLinkedList2 list2){
        list2.add(new Quant(1488228));
        list2.add(new Quant(1337322));
        list2.add(new Quant(7654321));
        list2.add(new Quant(1234567));
        list2.add(new Quant(2754421));
        list2.add(new Quant(505));
        list2.add(new Quant(2727540));
        list2.add(new Quant(322));
        list2.add(new Quant(101));
    }
}