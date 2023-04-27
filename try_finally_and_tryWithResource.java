import java.util.InputMismatchException;
import java.util.Scanner;

public class try_finally_and_tryWithResource {
    public static void main(String[] args) {
        int num=0;
        // try with resource
        try(Scanner sc= new Scanner(System.in);){
            num= sc.nextInt();
            sc.close();
 
         }
        //  catch(InputMismatchException e){
        //     System.out.println("something went wrong" + e);
        //     // sc.close();

        // }
        // finally{
        //     sc.close();
        //     System.out.println("resource close");
        // }
        System.out.println(num);

    }
    
}
