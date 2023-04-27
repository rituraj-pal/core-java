import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap hm= new HashMap();
        hm.put(null, null);
        hm.put(01, "rituraj");
        hm.put(02, "rahul");
        hm.put(03, "ruhni");
        hm.put("hello", "yak");

        System.out.println(hm);

        HashMap hm1= new HashMap();
        hm1.put("rahul", 01);
        hm1.put(02, "raj");
        hm1.put("mohan", 02);
        hm1.put("mayank ", "khan");
        System.out.println(hm1);


        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(04, 89);
        lhm.put(02, 76);
        lhm.put(03, 56);
        lhm.put(01, 45);
        System.out.println(lhm);

    }
}
