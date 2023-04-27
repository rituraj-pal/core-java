public class palindrone_case {
    public static void main(String[] args) {
        String Str1="MADAM";
        String Str2="";
        for( int i=Str1.length()-1 ; i>=0; i--){
            Str2= Str2 + Str1.charAt(i);
            
        }
        if( Str1.equals(Str2)){
            System.out.println("panlindrone");
        }
        else {
            System.out.println(" not panlindrone");
        }
    }
}
