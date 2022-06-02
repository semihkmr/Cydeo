package day61_Maps;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects {

    public static void main(String[] args) {


        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.offer("hello");
        queue.offer("world");
        queue.offer("java");
        queue.offer("selenium");
        queue.offer("apple");
        queue.offer("zebra");

        System.out.println(queue);

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("------------------------------");


        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("hello");
        arrayDeque.offer("world");
        arrayDeque.offer("java");
        arrayDeque.offer("selenium");
        arrayDeque.offer("apple");
        arrayDeque.offer("zebra");

        System.out.println(arrayDeque);

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());


    }
}
