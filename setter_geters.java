class student{
private int age;
private String name;

public void setAge(int age){
    this.age=age;
}
public int getAge(){
    return age;

}
public void setName( String name){
    this.name=name;

}
public String getName(){
    return name;

}
}
public class setter_geters {
    public static void main(String[] args) {
        student obj1=new student();
        student obj2=new student();

        obj1.setAge(198);
         obj2.setAge(469);
        obj1.setName("hhhhhhh");
        obj2.setName(" rrrrrr");
        int stud1Age=obj1.getAge();
        int stud2Age=obj2.getAge();
        System.out.println(stud1Age);
        System.out.println(stud2Age);



        
    }
}
