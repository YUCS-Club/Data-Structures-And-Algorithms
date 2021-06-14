package src.datastructures;

public class IntegerList {

    //Properties
    private int[] sourceArray;
    private int size;

    //Constants
    private static int DEFAULT_SIZE = 10;

    //Constructors
    public IntegerList() {
        size = 0;
        sourceArray = new int[size]; // size = 10
    }
    public IntegerList(int size){
        this.size = 0;
        sourceArray = new int[size];
    }

    // Functionalities
    public void add(int item){
        checkSize();
        size = size + 1;
        sourceArray[size - 1] = item;
    }
    public int getFirst(){
        if(size > 0){
            return sourceArray[0];
        }else {
            return -1;
        }
    }
    public int getLast(){
        if (size > 0){
            return sourceArray[size - 1];
        }else {
            return -1;
        }
    }
    public int get(int index){
        if(index < size){
            return sourceArray[index];
        }else {
            return -1;
        }
    }
    public int getSize(){
        return size;
    }
    public void set(int index, int value){
        if(index < size){
            sourceArray[index] = value;
        }
    }
    public void removeItemAt(int index){
        // cut
        // remove
        // join
        if(index < size){
            if(index == size-1){
                sourceArray[0] = -1;
            }else{
                int[] newArray = new int[sourceArray.length];
                // 3 <- remove item at 3
                // Replace items before the index
                for(int i = 0; i < index; i++){
                    newArray[i] = sourceArray[i];
                }
                // Replace items after the index
                for(int i = index + 1; i < size; i++){
                    newArray[i-1] = sourceArray[i];
                }
                sourceArray = newArray;
            }
        }
    }

    //Helper methods
    private void checkSize(){
        if(this.size + 1 > sourceArray.length){
            sourceArray = makeNewArray();
        }
    }

    private int[] makeNewArray(){
        // size - 5
        // size - 15
        int[] newArray = new int[size + 10];
        for(int i = 0; i < sourceArray.length; i++){
            newArray[i] = sourceArray[i];
        }
        return newArray;
    }

    //Override toString

    @Override
    public String toString(){
        String listItems = "[";
        for(int i = 0 ; i< size; i++){
            listItems += sourceArray[i];
            if(i != size -1){
                listItems += " , ";
            }
        }
        listItems += "]";
        return listItems;
    }
}