//  parent class, base class,  super class 
 class human 
{
    int age;
    void sleep(){
        age=18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}
// child class , sub class, derived class 
    class student extends human{

    }
public class inheritance_intro {
    public static void main(String[] args) {
        student st= new student();
        st.sleep();

        
    }
}
