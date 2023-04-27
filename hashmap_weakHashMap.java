import java.util.HashMap;

class emploee {
    private String name;
    private int empId;

    public emploee(String name, int empId) {
        this.name = name;
        this.empId = empId;

    }

    public String toString() {
        return empId + " ";

    }

    @Override
    public void finalize() {
        System.out.println("cleanup work by garbage collector before de allocating memory from heap");
    }

}

public class hashmap_weakHashMap {
    public static void main(String[] args) {
        emploee e = new emploee("rituraj", 05);
       
       
        HashMap hm = new HashMap();
        hm.put(e, "rituraj");
        System.out.println(hm);
       
       
       
        e = null; // eligible for garbage collector
        System.gc(); // invoking garbage collector

        
        System.out.println("the end");

    }
}
