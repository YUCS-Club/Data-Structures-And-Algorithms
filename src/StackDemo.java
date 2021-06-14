package src;

import src.datastructures.StringStack;

public class StackDemo {
    public static void main(String[] args){
        StringStack stack = new StringStack();

        stack.push("Ko Kyaw");
        stack.push("Naing Aung Luu");
        stack.push("Ko Lin Maung");
        stack.push("Ko Phone Min Myat");

        while(stack.hasNext()){
            System.out.println("Popped Item " + stack.pop());
        }

    }
}
