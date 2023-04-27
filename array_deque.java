// package collection;
import java.util.ArrayDeque;

public class array_deque {
    public static void main(String[] args) {
        ArrayDeque ad1= new ArrayDeque();
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);

        System.out.println(ad1);
        ad1.addFirst("ritu");
        ad1.addLast("raj");
        System.out.println(ad1);
        ad1.offer(500);
        ad1.offerLast(10000);
        ad1.offerFirst(200000);
        System.out.println(ad1);
    }
}
