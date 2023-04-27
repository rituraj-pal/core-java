class car implements Runnable{
    
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+"has entered the parking lot");
            Thread.sleep(2000);
           
            synchronized(this) {
                System.out.println(Thread.currentThread().getName()+"got into the car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"came back and parked the car");
            }
            
        }
        catch( Exception e){
            System.out.println("error");
        }
    }
}
public class synchronization {
    public static void main(String[] args) {
        car c= new car();

        Thread t1= new Thread(c);
        Thread t2= new Thread(c);
        Thread t3= new Thread(c);
        t1.setName("Mard-1");
        t2.setName("Mard-2");
        t3.setName("Mard-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
