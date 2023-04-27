class Demo1{
    int a,b;

    public Demo1(){
        System.out.println("parent class constructor");
    }
    public Demo1(int x , int y){
        System.out.println("paramiterize parent class constructor");
        a=x;
        b=y;

    }

}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        this( 10,50);
        System.out.println("child class constructor");
    }
    public Demo2(int x, int y){
        System.out.println("paramiterize child class constructor");
        m=x;
        n=y;
    }

}
public class constructor_execution{
    public static void main(String[] args) {
       Demo2 dm= new Demo2();
        // Demo2 dm= new Demo2( 10,50);
        
        
    }
}