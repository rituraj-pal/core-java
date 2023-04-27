class parent{
    public void family(){
        System.out.println(" i am the oldest in the family");
    }
    public void earning(){
        System.out.println(" only the person i am earning");
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

}
public class polymorphism {
    public static void main(String[] args) {

        child2 cd= new child2();
        // cd.family();
        // cd.earning();
        parent ref;
        ref=cd;
        ref.earning();
        ref.family();
        System.out.println("--------------------------------------------");
        child1 cd1= new child1();
        ref=cd1;
        ref.earning();
        ref.family();

        
    }
}
