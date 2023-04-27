class student{
   private int rollnumber;
int marks;
String name;

 public void show(){
    System.out.println(rollnumber + " "+ marks+" "+ name);
 }
public void setData1( int a){
    name="raaaaaaz";
    marks=a;

    rollnumber=21;

}
public void setData2(int a){
   
    // rollnumber=30;
    marks=a;

}
}
public class encapsulation {
    public static void main(String args[]){
        student obj= new student();
        student obj1= new student();
        // obj.rollnumber=21;
        // obj.marks=89;
        // obj.name="rituraj";
obj.setData1(77);
obj1.setData2(87);
        obj.show();
        obj1.show();

    }
}
