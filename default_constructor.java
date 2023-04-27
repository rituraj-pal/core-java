class facebook{
    private int view;
    private int likes;
    facebook(){
        System.out.println("your default constructor");

    }

    facebook( int view, int likes){
        this.view=view;
        this.likes=likes;


    }
    void disp(){
        System.out.println(view);
        System.out.println(likes);



}

}
public class default_constructor {

    public static void main(String[] args) {
        facebook fb= new facebook();
        facebook fb1= new facebook(10,34);

        fb.disp();
        fb1.disp();

        
    }
}
