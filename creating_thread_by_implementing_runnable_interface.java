import java.util.Scanner;

class calc implements Runnable {
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

class message implements Runnable {
    public void run() {
        System.out.println("displaying important message task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("focus is important to master skills");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("some error");
        }
        System.out.println("displaying import message task ended");

    }

}

public class creating_thread_by_implementing_runnable_interface {
    public static void main(String[] args) {
        System.out.println("main method");
        calc c = new calc();
        message msg = new message();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(msg);

        t1.start();
        t2.start();
    }
}
