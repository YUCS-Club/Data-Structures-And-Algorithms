package src;

public class IntegerLinkedList {
    //Properties
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    //Constructors
    public IntegerLinkedList(){}

    // Functions
    public void add(int value){
        Node node = new Node(value);
        if( size == 0 ){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public int getFirst(){
        return head.value;
    }
    public int getLast(){
        return tail.value;
    }
    public int get(int index){
        Node currentNode = head;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }
    public int getSize(){
        return size;
    }
    public void set(int index, int value){
        if(index < size) {
            Node currentNode = head;
            for(int i = 0 ; i < index ; i++){
                currentNode = currentNode.next;
            }
            currentNode.value = value;
        }
    }
    public void removeItemAt(int index){
        Node currentNode = head;
        for(int i = 0 ; i < index - 1 ; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }
    // Helper methods

    // member classes


    class Node {
        //Properties
        public int value;
        public Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
}
