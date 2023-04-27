import java.util.Scanner;

class Mythread extends Thread {
    public void run() {
        String tName = Thread.currentThread().getName();
        if (tName.equals("CALC")) {
            calc();
        } else {
            importantmsg();
        }

    }

    public void calc() {
        System.out.println("calculation task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number");
        int num1 = sc.nextInt();
        System.out.println("please enter second number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("calculation task ended");
        System.out.println("**************************************");
    }

    public void importantmsg() {
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

public class Multiple_task_within_single_run {
    public static void main(String[] args) {
        System.out.println("main thread started");
        MyThread Thread1 = new MyThread();
        Mythread Thread2 = new Mythread();
        Thread1.setName("CALC");
        Thread2.setName("PRINT");

        Thread1.start();
        Thread2.start();

    }
}
