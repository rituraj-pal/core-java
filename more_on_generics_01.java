import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.*;
class Gen<T>{
T obj;
public Gen(T obj){
    this.obj=obj;
}
public void disp(){
    System.out.println("the type of data is:+ "+ obj.getClass().getName());
}
public T getObj() {
    return obj;
}


}

public class more_on_generics_01 {
    public static void main(String[] args) {

        Gen<String> g= new Gen<String>("rituraj");
        g.disp();
        // g.getObj();
        System.out.println(g.getObj());
        System.out.println("****************************");
        Gen<Integer> g1= new Gen<Integer>(10);
        g1.disp();
        // g.getObj();
        System.out.println(g1.getObj());
        // ArrayList<String> list1=new ArrayList<String>();
        // List <String> list2=new ArrayList<String>();
        // Collection <Integer> list3=new ArrayList<Integer>();

        // List <Object> list4= new ArrayList<>(String);
        // error compile time because generics type ko parent nhi bana sakte

    }
}
