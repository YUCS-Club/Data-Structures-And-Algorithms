package src.datastructures;

public class StringStack {
    //Properties
    StringNode topItem;
    int size;

    //Constructors
    public StringStack() {
        size = 0;
        topItem = null;
    }

    //Methods
    public void push(String itemValue){
        // topItem ( value or null )
        StringNode newItem = new StringNode(itemValue);
        newItem.next = topItem;
        topItem = newItem;
        size++;
    }

    public String pop(){
        // topItem(value or null )
        String value = topItem.value;
        topItem = topItem.next;
        size--;
        return value;
    }

    public String peek(){
        return topItem.value;
    }

    public boolean isEmpty(){
        return (topItem == null);
    }

    public boolean hasNext(){
        return (topItem != null);
    }



    class StringNode{
        String value;
        StringNode next;
        public StringNode(String value){
            this.value = value;
            next = null;
        }
    }

}
