// package collection;

import java.util.*;
public class rituraj {
    public static void main(String[] args)
     {
        ArrayList al1= new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println("**********************************");

        List al2= new ArrayList();
        al2.add("raj");
        al2.add('s');
        al2.add(20000);
        al2.add(3.4);
        System.out.println(al2);
        al2.add("jarutir");
        System.out.println(al2);
        System.out.println("*******************************");

        ArrayList al3 = new ArrayList<>();
        al3.add(1);
        al3.add(2);
        al3.add(5);
        System.out.println(al3);
        System.out.println("after addint collection");
        al3.addAll(al2);
        System.out.println(al3);




        

    }
}
