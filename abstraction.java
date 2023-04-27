abstract class parent{
    abstract public void family();
    // {
        // System.out.println(" i am the oldest in the family");
    // }
   abstract public void earning();
//    {
        // System.out.println(" only the person i am earning");
    // }
public void relative(){
    System.out.println("relative mc");
}

}

class child1 extends parent
{
    public void family(){
        System.out.println(" i am the youngest in the family");
    }
    public void earning (){
        System.out.println("i cannot earn");
    }
}
 class child2 extends parent
{
    public void family(){
        System.out.println("i am the elder in the family");
    }
    public void earning(){
        System.out.println(" i am also earning");
    }
    public void alert(){
        System.out.println("alert");
    }
}
public class abstraction {
    public static void main(String[] args) {
        parent cd1=new child1();
        cd1.family();
        cd1.earning();
        cd1.relative();
        parent cd2= new child2();
        cd2.family();
        cd2.earning();
        // cd2.alert();
cd2.relative();
    }
    }

