// package collection;

import java.util.LinkedList;

public class more_on_linked_list {
    public static void main(String[] args) {
        LinkedList ll1= new LinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(30);
        System.out.println(ll1);
        System.out.println(ll1.get(1));

        System.out.println(ll1.indexOf(30));
        System.out.println(ll1.lastIndexOf(30));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        ll1.pop();
        
    }
}
