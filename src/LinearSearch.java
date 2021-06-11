package src;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){

       int[] sourceArray = { 2 , 4 , 5 ,6 , 100 , 20};
       //Receive input
       System.out.println("Enter your number to search");
       Scanner scanner = new Scanner(System.in);
       int numberToSearch = scanner.nextInt();

       boolean dataFound = search(numberToSearch , sourceArray);

       if(dataFound == true){
           System.out.println("Number " + numberToSearch + " is in the array");
       }else {
           System.out.println("Number " + numberToSearch + " is not in the array");
       }
        scanner.close();
    }

    static boolean search(int numberToSearch , int[] sourceArray){
        for (int number : sourceArray){
            if(number == numberToSearch){
                return true;
            }
        }
        return false;
    }
}
