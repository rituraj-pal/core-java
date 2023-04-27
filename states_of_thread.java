import java.util.Scanner;
class MyThread implements Runnable{
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a first number");
        int num1 = sc.nextInt();
        System.out.println("please enter a second number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("calculation task ended");
        System.out.println("*********************************************");

    }
}
public class states_of_thread {
    public static void main(String[] args) {
        MyThread t= new MyThread();
        Thread t1= new Thread(t);
        t1.start();
        
    }
}
