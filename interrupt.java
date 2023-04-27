class demo implements Runnable{
    public void run(){
        try {
        for (int i = 0; i < 3; i++) {
            System.out.println("focus is important to master skills");
            Thread.sleep(3000);
        }
    } catch (Exception e) {
        System.out.println("some error");
    }
}
}
public class interrupt {
    public static void main(String[] args) {
        demo d= new demo();
        Thread t=new Thread(d);
        t.start();
        t.interrupt();
        
    }
}
