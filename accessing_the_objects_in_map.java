import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class accessing_the_objects_in_map {
    public static void main(String[] args) {
        // entry
        Map map= new HashMap();
        map.put(01, "rohan");
        map.put(02, "rahul");
        map.put(03, "rakesh");
        map.put(04, "rakkkkkkaaaaaaaa");
        System.out.println(map);


        System.out.println(map.get(04));

        // return only keys
        Set keyset=map.keySet();
        
       Iterator itr= keyset.iterator();
       while(itr.hasNext()){
        // System.out.println(itr.next());
       Integer key=(Integer) itr.next();
       System.out.println(key);
       }

    //    return only values
    
    
   Collection values= map.values();
    Iterator itr2= values.iterator();
    while(itr2.hasNext()){
        // System.out.println(itr2.next());
       String names=(String) itr2.next();
       System.out.println(names);
    }

    // entry 
   Set entrSet= map.entrySet();
  Iterator itr3= entrSet.iterator();
  while(itr3.hasNext()){
    // System.out.println(itr3.next());
    
   Map.Entry en=(Entry) itr3.next();
   System.out.println(en.getKey()+":"+en.getValue());
  }
    }
}


