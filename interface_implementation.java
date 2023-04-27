interface A{
    void show();

}
interface X{
   public void abc();

     
}
class B implements A,X{
   public void show(){
        System.out.println(" in showing");
    }
    public void abc(){
        System.out.println("in abcccccccccc");
    }

}
public class interface_implementation {
    public static void main(String[] args) {
        A obj= new B();
        obj.show();
        // obj.abc();
        
    }
}
