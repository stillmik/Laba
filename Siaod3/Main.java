package Siaod3;

public class Main {

    private static IgorLinkedList list = new IgorLinkedList();

    public static void main(String[] args) {
        addDani(list);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getCurrent().getFullname());
            list.setCurrent(list.getCurrent().getNext());
        }
        System.out.println();
        fndName(list,1488228);
        fndNum(list,"Боров Валерий Альбертович");
    }

    private static void addDani(IgorLinkedList list){
        list.add(new Node("Жмышенко Валерий Альбертовий", 1488228));
        list.add(new Node("Боров Валерий Альбертович", 1337322));
        list.add(new Node("Фиталис Антон Павлович", 880555353));
        list.add(new Node("Жмышенко Валерий Альбертович", 4227541));
        list.add(new Node("Коблучков Денис Сухачев", 2448961));
        list.add(new Node("Тимошенко Светлана Неважно",1234567));
        list.add(new Node("Путин Владимир Владимирович",7654321));
    }

    private static void fndName(IgorLinkedList list, int number) {
        list.reset();
        while (list.getCurrent() != null && number != list.getCurrent().getNumber()) {
            list.setCurrent(list.getCurrent().getNext());
        }
        if (list.getCurrent() == null) {
            System.out.println("Номер отсутствует");
        } else{
            System.out.println("Имя: " + list.getCurrent().getFullname() + "|Номер: " + number);
        }
    }

    private static void fndNum(IgorLinkedList list, String name){
        list.reset();
        while(list.getCurrent() != null && !name.contentEquals(list.getCurrent().getFullname())) {
            list.setCurrent(list.getCurrent().getNext());
        }
        if(list.getCurrent() == null) {
            System.out.println("Абонент отсутствует");
        }
        else{
                System.out.println("Имя: " + name + "|Номер: " +  list.getCurrent().getNumber());
                list.setCurrent(list.getCurrent().getNext());
        }
    }

}