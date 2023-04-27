import java.util.HashMap;
import java.util.Map.*;

// import javax.swing.RowFilter.Entry;

import java.util.*;

class student {
    private String names;
    private int age;
    private String city;

    public student(String names, int age, String city) {
        this.names = names;
        this.age = age;
        this.city = city;

    }

    public String getNames() {
        return names;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
    public String toString(){
        return names +" "+ age+" "+ city;
    }
}

public class more_on_hashmap {
    public static void main(String[] args) {

        student st1= new student("rituraj", 21, "varanasi");
        student st2= new student("anish", 22, "gaziyabad");
        student st3=new student("zawed", 25, "bhopal");

        Map map=new HashMap();
        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);
        System.out.println(map);

         Set entry=map.entrySet();
Iterator itr= entry.iterator();
        while(itr.hasNext()){
            // System.out.println(itr.next());
       Map.Entry data=(java.util.Map.Entry)itr.next();
       System.out.println(data.getKey()+" "+ data.getValue());
        }


            
        

    }
}
