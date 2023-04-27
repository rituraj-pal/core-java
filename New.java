public class New {
public void start() { 

    System.out.println("TestA");
 }
    
    
    
    public class New extends TestA {
    
    public void start() { 
    
    System.out.println("TestB");
 }
 
    public static void main(String[] args) {
      
        ((TestA)new New()).start();
    }
}
}

