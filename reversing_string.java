public class reversing_string {
    public static void main(String[] args) {
    //  String str1="rituraj pal";
    //  String str2="";
     
    // for( int i=str1.length()-1; i>=0;i--){
    //   str2=   str2 + str1.charAt(i);
    // }
    // System.out.println(str2);
    String str1= "rituraj pal";
    String str2="";
String arr[]=str1.split(" ");
    for( int i=arr.length-1; i>=0; i--){
        str2= str2 + arr[i]+ " ";
 }
    System.out.println(str2);

   
    String rev1=" new house";
    String rev2="";
    String raay []= rev1.split(" ");
    for( String ele:raay){
        for( int i=ele.length()-1; i>=0; i--){
            rev2= rev2 + ele.charAt(i);

        }
        rev2= rev2 +" ";


    }
    System.out.println(rev1);
    System.out.println(rev2);

    }
}
