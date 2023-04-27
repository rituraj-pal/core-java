// class calc {
//     public int add( int x, int y){
//         int res= x+y;
//         return res;

//     }
// }
class calc {
    public int add( int nums[])
    {
        int res=0;
        for( int n: nums){
            res= res+n;
        }
            return res;


        }

    public void start() {
    }



    }

public class anonymousArray {
    public static void main(String[] args) {
//         calc obj= new calc();
//         int res=obj.add(2, 3);
//         System.out.println(res);

        calc obj= new calc();
        // int nums[]= { 2,4,6,9};
        // int res= obj.add(nums);
        int res= obj.add(new int [] { 2,4,6,9});
        System.out.println(res);


    }
}

