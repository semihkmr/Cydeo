package StringMedium;

import java.util.PriorityQueue;

public class Eurodaka {

    public static void main(String[] args) {

        PriorityQueue<Integer> que = new PriorityQueue<>();

        que.add(9);
        que.add(5);
        que.add(3);
        que.add(6);
        que.add(7);
        que.add(4);

        System.out.println(que);
        que.poll();
        System.out.println(que);
        que.poll();
        System.out.println(que);


    }
}
