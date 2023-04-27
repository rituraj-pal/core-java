class human1{
    private String name;
    int age;
    human1()
    {
System.out.println("human class constructor");
    }

    void sleep(){
        System.out.println("human needs good sleep");
        age=18;
        System.out.println(age);

    }
}
    class student extends human1
    {
        student(){
            super();
        }
       
        void disp()
        {
            System.out.println(" the age is :" + age);
        //  System.out.println(" the name is :" + name);    
        }

    }
public class more_on_inheritance {
    public static void main(String[] args) {
        student st= new student();
        st.sleep();
        st.disp();


        
    }
}
