class demo{
    public void a() throws Exception
    {
        b();

    }
   public void  b() throws Exception
   {
    int num1=5;
    int num2=0;
  
    int result=num1/num2;
    System.out.println(result);
   
   
   
    

    }

}
public class handlingVsDuckingTheException {
    public static void main(String[] args) {
        demo obj= new demo();
       try{
        obj.a();
       }
       catch(Exception e){
        System.out.println("error");
       }
    }
    
}
