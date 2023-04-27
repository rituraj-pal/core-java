// package collection;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList<>();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        System.out.println(ll1);

        LinkedList ll2= new LinkedList();
        ll2.add("rituraj");
        ll2.add('R');
        ll2.add(2);
        ll2.add(1.8);
        System.out.println(ll2);

        LinkedList ll3= new LinkedList();
        ll3.add(10);
        ll3.add(20);
        ll3.add(30);

        ll3.addFirst("Mr.");
        ll3.addLast(1000000);
        System.out.println(ll3);
ll3.add(2, 400);
        System.out.println(ll3);
    
        System.out.println(ll3.peek());
        System.out.println(ll3);
        System.out.println("*****************");
     System.out.println(   ll3.poll());
     System.out.println(ll3);

        
    }
}
