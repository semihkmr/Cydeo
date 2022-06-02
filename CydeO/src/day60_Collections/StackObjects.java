package day60_Collections;

import java.util.Stack;

public class StackObjects {


    public static void main(String[] args) {


        Stack<Character> stack = new Stack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);
        System.out.println("stack.peek() = " + stack.peek()); // return last thing that added
        System.out.println("stack.pop() = " + stack.pop()); // removes the element top of the stack
        System.out.println("stack = " + stack);


        System.out.println("stack.remove(0) = " + stack.remove(0)); // when you want to remove specific element with the index
        System.out.println("stack = " + stack);

        /*
        Difference between push() and add() methods
        functionality is the same, add elements to stack

        add method (from collection interface) returns boolean
        push method (from stack) returns objects
         */
    }
}
