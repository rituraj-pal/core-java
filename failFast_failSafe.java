import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class failFast_failSafe {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i));
        //     al.add(100);
            
        // }
// fail fast 
        Iterator itr= al.iterator();
        while( itr.hasNext()){
            System.out.println(itr.next());
        // al.add(100);

        }
        //    fail safe // 
 
        CopyOnWriteArrayList al1= new CopyOnWriteArrayList();
        al1.add(90);
        al1.add(100);
        al1.add(110);
        al1.add(120);
        System.out.println(al1);

        Iterator itr1= al1.iterator();

        while(itr1.hasNext());
        {
            System.out.println(itr1.next());
            al1.add(100);

        }

            

         
            
        

    }
}
