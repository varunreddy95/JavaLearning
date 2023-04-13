package Collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollLast();
        dq.pollLast();

        //Using offerLast and pollLast is basically implementing Stack
        //Using OfferFirst and pollFirst is queue

        dq.forEach((x)->System.out.println(x));
    }
}
