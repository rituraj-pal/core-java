class demo implements Runnable 
{
    public void run(){
        try {
        for (int i = 0; i < 3; i++) {
            System.out.println("focus is important to master skills");
            Thread.sleep(1000);
        }
    } catch (Exception e) {
        System.out.println("some error");
    }
    }

    }
    

public class join_isalive_method {
    public static void main(String[] args) throws Exception
    {
        System.out.println("main thread started");
        demo d=new demo();
        Thread t=new Thread(d);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        t.join();
        System.out.println("main thread ended");
        
    }
}
