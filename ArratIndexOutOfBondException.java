public class ArratIndexOutOfBondException {
    public static void main(String[] args) {
        int num []= { 2,3,6,9};
        // System.out.println(num[num.length-1]);
        // System.out.println("OYE");
        // for( int i=0; i<4; i++){
        //     System.out.println(num[i]);
        // }
        // we cal also do by enhance for loop
        for( int n: num){
            System.out.println(n);
        }
    }
}
