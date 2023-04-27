interface A{
// public static final----by default it is use
    int num=5;
    
    // method is only declared not define
    void show();

}
public class interface_define {
    public static void main(String[] args) {
        System.out.println(A.num);
    //    cannnot instantiate it menas cannot make object
        // A obj= new A();

    }
}
