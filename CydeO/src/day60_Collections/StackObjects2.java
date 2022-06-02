package day60_Collections;

import java.util.Stack;

public class StackObjects2 {

    public static void main(String[] args) {

        Stack<Integer>  stack = new Stack<>();


        stack.push(40);
        stack.add(20);
        stack.push(100);
        stack.add(30);


        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());
    }
}
