public class ques_03 {
    public static void main(String[] args) {
        int n=5;
        for( int i=1; i<=5; i++){
            for( int j=1; j<=5; j++){
                if( j==1 || i==(n+1)/2  || j==n){
                    System.out.print("*");
                }
                else{
                     System.out.print( " ");
                }
              
            }
            System.out.println();
        }
    }
}
