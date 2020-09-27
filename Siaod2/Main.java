package Siaod2;

public class Main {
    public static void main(String[] args) {
        System.out.print("K/N");
        for(int i = 1; i <=64; i ++) {
            System.out.printf("%3d", i);
        }
        for(int k = 2; k <= 10; k ++){
            System.out.printf("\n%2d ",k);
            for(int n = 1; n <= 64; n++){
                IgorLinkedList list = new IgorLinkedList();
                for (int i = 1; i <= n; i++) {
                    list.add(new Node(i));
                }
                list.reset();
                while (list.getSize() != 1) {
                    for (int i = 1; i < k - 1; i++) {
                        list.setCurrent(list.getCurrent().getNextNode());
                    }
                    list.delete();
                    list.setCurrent(list.getCurrent().getNextNode());
                }
                list.reset();
                System.out.printf("%3d",list.getHead().getNum());
            }
        }
    }
}