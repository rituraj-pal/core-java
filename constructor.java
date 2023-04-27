class student{
    private int age;
    private String name;

    student(int age, String name){
        this.age=age;
        this.name=name;

    }
    public int getAge(){
        return age;

    }
    public String getName(){
        return name;

    }
}
public class constructor {
    public static void main(String[] args) {
        
        student obj= new student( 10, "rahul");
        int age= obj.getAge();
        System.out.println(age);
        String name=obj.getName();
        System.out.println(name);


    }
}
