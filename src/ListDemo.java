package src;

public class ListDemo {
    public static void main(String[] args){
        IntegerLinkedList list = new IntegerLinkedList();
        list.add(10); //0
        list.add(12); //1
        list.add(145); //2
        list.add(41); //3
        list.add(343); //4
        list.add(343); //5
        list.add(343); //6
        list.add(344); //7
        list.set(3 , 100);
        list.removeItemAt(4);
        System.out.println(list.get(4));
    }
}
