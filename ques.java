import java.util.Scanner;

public class ques {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=1;
        for(int i=1; i<=b;i++){
         prod = prod*a;
        }
        System.out.println(prod);
    }
}
