import javax.lang.model.util.ElementScanner14;

class Library implements Runnable {
    String res1 = new String("java");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

public void run(){
    String name=Thread.currentThread().getName();
    if(name.equals("Student-1"))
    {
try{
    Thread.sleep(3000);
    synchronized (res1)
    {
System.out.println("student 1 has acc"+res1);
Thread.sleep(3000);
synchronized (res2)
    {
        System.out.println("student 1 has acc"+res2);
        Thread.sleep(3000);
        synchronized (res3)
    {
        System.out.println("student 1 has acc"+ res3);
    }
    }
}
    }
    catch(Exception e)
    {
        System.out.println("some error");
    }
}
    else{
        try{
            Thread.sleep(2000);
            synchronized (res1)
            {
        System.out.println("student 1 has acc"+res1);
        Thread.sleep(2000);
        synchronized (res2)
            {
                System.out.println("student 1 has acc" +res2);
                Thread.sleep(2000);
                synchronized (res3)
            {
                System.out.println("student 1 has acc"+ res3);
            }
            }
        }
            }
            catch(Exception e)
            {
                System.out.println("some error");
            }
        }

        
}
}
    

public class dead_lock {
    public static void main(String[] args) {
        Library lb= new Library();

        Thread t1= new Thread(lb);
        Thread t2= new Thread(lb);
        t1.setName("student-1");
        t2.setName("student-2");

        t1.start();
        t2.start();
        

    }
}
