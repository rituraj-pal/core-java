class A{
    void display(){
        System.out.println(" in display");
    }
    class B
    {
        void show(){
            System.out.println("in showing");
        }
    }
}
public class inner_class {
    public static void main(String[] args) {
        A obj= new A();
        A.B obj1= obj.new B();

        obj.display();
        obj1.show();

        
    }
}
