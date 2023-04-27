public class print_diagonal {
    public static void main(String[]args){
        for( int i=0; i<=10;i++){
            for ( int j=0; j<=10; j++){
                if( i==j || i+j==10  ||i+j==5 ||i-j==5 ||i+j==15 || j-i==5|| i==0 || j==0 || i==10 ||j==10){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

                for ( int j=0; j<=10; j++){
                    if(i+j==5 ||i-j==5 ||i+j==15 || j-i==5|| i==0 || j==0 || i==10 ||j==10){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }

    }
}
