public class enhanced_for_loop {
    
    public static void main(String[] args){

        // int nums[] = { 2,4,6,7};
        // for( int n: nums){
        //     System.out.print(n +" ");
        // }
        int nums [][] ={
            {3,5,6,4},
            {2,4,9,0},
            {1,5,8,0}
        };
        for( int a []: nums){
            for( int b: a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }
    }
}
