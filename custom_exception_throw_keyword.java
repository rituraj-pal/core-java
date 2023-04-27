
class MyException extends Exception
{
    MyException(){

    }
    MyException(String msg){
        super(msg);

    }

}
public class custom_exception_throw_keyword {
    public static void main(String[] args) {
        int num1=6;
        int num2=-2;
        try{
            if(num2<0){
                Exception e= new MyException("negative number");
                throw e;
            }
            else{
            int result =num1/num2;
        System.out.println(result);
        }
    }
        catch(Exception e){
            System.out.println("enter a valid number" +"  " +e );
        }
    }
}
