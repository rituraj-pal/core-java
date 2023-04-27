interface computer{

    void compileCode(); 
    

}
class laptop implements computer{
    public void compileCode(){
        System.out.println("you got 5 errors");
    }
}
class desktop implements computer{
    public void compileCode(){
        System.out.println("you got 5 errors faster");
    }
}
class developer {
    
    public void bulidApp(computer desk){
        
        System.out.println("building App");
      desk.compileCode();

    }
}
public class need_of_interface {
    public static void main(String[] args) {
        // laptop lp= new laptop();
        computer desk= new desktop();
        // computer lp= new laptop();
        developer dp=new developer();
        dp.bulidApp(desk);
       
    }
}
