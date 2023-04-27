import java.util.ArrayList;

public class generics_in_java {
    public static void main(String[] args) {
        
        // type safety
        // String ar[]= new String[10];
        // ar[0]="rituraj";
        // ar[1]="pal";
        // ar[2]="coder";
        // // ar[3]=5;  
        // String name1=ar[0];
        // String  name2=ar[1];
        // System.out.println(ar[2]);

        // no type safety
        // type safety using generics
        ArrayList<String> al=new ArrayList<String>();
        al.add("rituraj");
        al.add("pal");
        // al.add(144);
// System.out.println(al.get(2));

// String n1=(String)al.get(0);// type casting--downcasting
// String n2= (String)al.get(1);
// String n3=(String)al.get(2);

String name1=al.get(0);
String name2=al.get(1);
System.out.println(name1);
System.out.println(name2);


        
    }
}
