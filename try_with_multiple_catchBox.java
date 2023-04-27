public class try_with_multiple_catchBox {
    public static void main(String[] args) {
        int a=9;
        int b=3;
        int result= 0;
        int values[]={2,4,6,8};
        try{
            System.out.println("in the try block");
            result= a/b;
            System.out.println(values[6]);

            
        
        }
        catch(ArithmeticException e){
            System.out.println(" cannot divide by zero"+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limited data"+e);
        }
        catch(Exception e){
            System.out.println("something went wrong"+e);
        }
        System.out.println(result);
        System.out.println("thank you");
    }
}
