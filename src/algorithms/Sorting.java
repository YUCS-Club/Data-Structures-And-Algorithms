package src.algorithms;

public class Sorting {
    public static void main(String[] args){
        int[] array = { 3 , 1 , 44 , 93 , 29, 0 , 12 , 8};
        System.out.println("Unsorted Array");
        printArray(array);

        selectionSort(array);
        System.out.println("Sorted Array");
        printArray(array);
    }

    static void bubbleSort(int[] array){
        for(int i = 1; i < array.length; i++){

            for(int j = 0; j < array.length -1 ; j++){
                if(array[j] > array[j+1]){
                    swap(array , j , j+1);
                }
            }

        }
    }

    static void selectionSort(int[] array){
        for(int i = 0; i< array.length; i++){
            int currentMin = array[i];
            int currentMinIndex = i;

            for(int j = i + 1 ; j < array.length; j++){
                if(array[j] < currentMin){
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            swap(array , currentMinIndex , i);
        }
    }

    //printArray
    static void printArray(int[] array){
        String arrayString = "[";
        for(int i = 0 ;i< array.length; i++){
            arrayString += array[i] + " ";
        }
        arrayString += "]";
        System.out.println(arrayString);
    }

    //swap
    static void swap(int[] array, int index1 , int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}