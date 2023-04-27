import java.util.ArrayList;

class student{
    private String name;
    private String id;


}
class emploee{
private String name;
    private String id;
    
}
public class basics_generics {
    public static void main(String[] args) {
        student st1=new student();
        student st2=new student();

        emploee e= new emploee();
        emploee e1=new emploee();

        ArrayList<student>al=new ArrayList<student>();
        al.add(st1);
        al.add(st2);
        // al.add(e);

        
    }
}
