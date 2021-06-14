package src;

import src.datastructures.StringQueue;

public class QueueDemo {
    public static void main(String[] args){
        StringQueue personList = new StringQueue(5);
        personList.enqueue("Apple");
        personList.enqueue("Banana");
        personList.enqueue("Grape");
        personList.enqueue("Lemon");
        personList.enqueue("Mango");

        personList.enqueue("Papaya");

        while(personList.hasNext()){
            System.out.println("Dequeued Item = " + personList.dequeue());
        }

    }
}
