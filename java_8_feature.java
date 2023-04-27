interface A{
    void show();
    default void config(){
        System.out.println(" in confuguration");
    }
    static void xyz(){
        System.out.println("in xyzzzyyyyyy");
    }
}
class B implements A
{
    public void show(){
        System.out.println("in showing");
    }

}
public class java_8_feature {
    public static void main(String[] args) {
        A.xyz();
        A obj = new B();
        obj.show();
obj.config();

        
    }
}
