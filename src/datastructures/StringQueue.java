package src.datastructures;


public class StringQueue {

    //Properties
    QueueNode firstItem;
    QueueNode lastItem;
    int size;
    int capacity;

    //Constructors
    public StringQueue(){
        firstItem = null;
        lastItem = null;
        size = 0;
        capacity = 10;
    }
    public StringQueue(int capacity){
        firstItem = null;
        lastItem = null;
        size = 0;
        this.capacity = capacity;
    }

    //Functions
    public void enqueue(String item){
        if(size + 1 > capacity){
            System.out.println("Capacity Exceeded!!!");
        }else{
            size ++;
            QueueNode newNode = new QueueNode(item);
            // add an item to lastItem
            if(firstItem == null){
                firstItem = lastItem = newNode;
                return;
            }

            lastItem.next = newNode;
            lastItem = newNode;
        }
    }

    public String dequeue(){
        String value = firstItem.value;
        firstItem = firstItem.next;
        size --;

        if(firstItem == null){
            lastItem = null;
        }

        return value;
    }


    public String peek(){
        return firstItem.value;
    }


    public boolean isEmpty(){
        return (firstItem == null);
    }


    public boolean isFull(){
        return (size == capacity);
    }

    public boolean hasNext(){
        return (firstItem != null);
    }

    class QueueNode{
        //Properties
        String value;
        QueueNode next;
        public QueueNode(String value){
            this.value = value;
            this.next = null;
        }
    }

}
