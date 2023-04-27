public class main_thread_in_java {
    public static void main(String[] args) {
        System.out.println("main thread");
        System.out.println("before changing");
         String name=Thread.currentThread().getName();
         System.out.println("the name of main thread is :"+ name);
         System.out.println(" the priority of main thread is"+ Thread.currentThread().getPriority());

         System.out.println("after changing");
         Thread th= Thread.currentThread();
         th.setName("rituraj");
         th.setPriority(9);
         String name1=Thread.currentThread().getName();
         System.out.println("the name of main thread is :"+ name1);
         System.out.println(" the priority of main thread is"+ Thread.currentThread().getPriority());

         


    }
}
