package dzien3.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleQueue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);

        System.out.println(deque);


        Deque<Integer> deque2 = new ArrayDeque<>();
        deque2.push(1);
        deque2.push(2);
        deque2.push(3);
        deque2.push(4);
        deque2.push(5);
        deque2.push(6);

        System.out.println(deque2);

        Deque<Integer> deque3 = new ArrayDeque<>();
        deque3.offer(1);
        deque3.offer(2);
        deque3.offer(3);
        deque3.offer(4);
        deque3.offer(5);
        deque3.offer(6);

        System.out.println(deque3);


        System.out.println("=====");
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}
