package src.algorithms;

public class Recursion {
    public static void main(String[] args){
        // fibonacci Sequence
        // fibonacci Sequence of 0 , 1
        //  n = 1 , 0 + 1 = 1 ,  0 1 1
        //  n = 2 , 1 + 1 = 2 , 0 1 1 2
        //  n = 3, 1 + 2 = 3 , 0 1 1 2 3
        // n = 4 , 2 + 3 = 5 , 0 1 1 2 3 5
        // n = 5 , 3 + 5 = 8 , 0 1 1 2 3 5 8

        System.out.println("5th fibonacci of 0 and 1 = " + fibonacciNumber(5 , 0 , 1));
    }

    static int fibonacciNumber(int n , int number1 , int number2){
        // base condition
        if(n <= 1){
            return number1 + number2;
        }
        // recursion call
        return fibonacciNumber(n-1 , number1 , number2) + fibonacciNumber(n - 2 , number1 , number2);
    }

    static int sumOfNumber(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfNumber(n -1);
    }


}
