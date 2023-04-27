import java.util.Enumeration;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector vec= new Vector();
        vec.add(100);
        vec.add(30);
        vec.add(60);
        System.out.println(vec);

         Enumeration en=vec.elements();
         while( en.hasMoreElements()){
            System.out.println(en.nextElement());
         }
    }
}
