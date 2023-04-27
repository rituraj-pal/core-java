import java.util.Hashtable;
import java.util.TreeMap;

public class other_inbuild_classess {
    public static void main(String[] args) {
        
        Hashtable ht=new Hashtable();
        ht.put(1, "rituraj");
        // ht.put(02, "rahul");
        ht.put(03, "ramesh");
        // ht.put(null, "raj");
    ht.putIfAbsent(02, "rahul");
    System.out.println(ht);

    TreeMap tm=new TreeMap();
    Integer i=new Integer(5);
    tm.put(i,"rohit");
    tm.put(02,"rahottt");
    tm.put(03, "raju");
System.out.println(tm);    
}
}
