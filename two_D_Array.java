public class two_D_Array {
    public static void main(String[] args) {
     int num [][]= new int[3][2];
    //  num  [0][0]=6;
    //  num [0][1]=3;
    //  num [0][2]=5;
    //  num [1][0]=6;
    //  num [1][1]=4;
    //  num [1][2]=3;
    //  num [2][0]=6;
    //  num [2][1]=2;
    //  num [2][2]=2;
    

    // jagged array
    int num [][] ={
        {2,5},
        { 3,5},
        {4,9}

    };


        for( int i=0; i<=2;i++){
            for( int j=0; j<=2;j++){
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }
    }
}
