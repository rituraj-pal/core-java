class MyThread extends Thread{
    public void run(){
        System.out.println("child thread");
    }
}
public class how_to_create_thread {
    public static void main(String[] args) {
        System.out.println("main thread");
        MyThread t= new MyThread();
        t.start();
        
    }
}
