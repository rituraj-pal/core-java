public class immutable_string {
    public static void main(String[] args) {
        String L1= "library";
        String L2= "library";
        System.out.println(L1==L2);
        String L3=new String("newlibrary");
        String L4=new String("newlibrary");
        System.out.println(L3==L4);

    }
}
