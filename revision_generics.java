import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class student{
    int marks;
    int age;
    String name;

    public student (int marks,int age, String name){
        this.marks=marks;
        this.age=age;
        this.name=name;
    }
    public int getMarks(){
        return marks;

    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public String toString(){
        return marks+"-"+age+"-"+name;
    }

}
 class Alpha implements Comparator<student>{
    public int compare(student a,student b){
        if(a.age>b.age)
        {
            return 1;
        }
        else{
            return -1;
            
        }
    }

 }



public class revision_generics {
    public static void main(String[] args) {
        student st1=new student(99, 16, "rituraj");
        student st2=new student(66, 15, "rahul");
        student st3=new student(33, 12, "ravi");

        List<student> list=new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        Alpha a=new Alpha();
        Collections.sort(list, a);;
        System.out.println(list);
        
    }
}
