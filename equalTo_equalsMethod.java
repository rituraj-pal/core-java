public class equalTo_equalsMethod {
    public static void main(String[]args){
        String s1="rituraj";
        String s2= new String("rituraj");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3= "intership";
        String s4= "intership";
        String s5= "INTERSHIP";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

    }
    
}