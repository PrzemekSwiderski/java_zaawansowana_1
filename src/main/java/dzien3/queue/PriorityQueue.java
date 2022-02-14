package dzien3.queue;

import java.util.Comparator;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2 ? 1: -1;
            }
        });

        queue.add(2);
        queue.add(1);
        queue.add(4);
        queue.add(3);
        queue.add(5);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());



    }
}
