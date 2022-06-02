package day60_Collections;

import java.util.PriorityQueue;

public class QueueObjects {


    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);

       // queue.get();  this is from list

        System.out.println(queue);



        queue.offer(30);
        System.out.println(queue);



        // queue.offer(null);  You can not have null in queue is not allowed!

        //System.out.println(new PriorityQueue<>().remove()); // this cause exceptions
        System.out.println(new PriorityQueue<>().poll()); // it does not cause any exceptions



    }



}
