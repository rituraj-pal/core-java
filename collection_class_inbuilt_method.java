import java.util.ArrayList;
import java.util.Collections;

import javax.sound.sampled.SourceDataLine;

public class collection_class_inbuilt_method{
    public static void main(String[] args) {
        
        ArrayList ar= new ArrayList();
        ar.add(10);
        ar.add(300);
        ar.add(30);
        ar.add(470);
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);
System.out.println("***************************");

        ArrayList<String> ar1=new ArrayList<String>();
        ar1.add("raju");
        ar1.add("pyaar mat ");
        ar1.add("kariyoo");
        System.out.println(ar1);
        Collections.sort(ar1);
        System.out.println(ar1);

        ArrayList ar2= new ArrayList();
        ar2.add(10);
        ar2.add(300);
        ar2.add(30);
        ar2.add(470);
        System.out.println(ar2);
        int index= Collections.binarySearch(ar2, 300);
        System.out.println("the index is :" +  index);

        Collections.rotate(ar2, 3);
        System.out.println(ar2);
        Collections.shuffle(ar2);
        System.out.println(ar2);
        int fr=Collections.frequency(ar2, 300);
        System.out.println(fr);
    }
    
    
}