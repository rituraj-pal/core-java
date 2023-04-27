interface car{
void drive( int speed);

}
public class lambda_exression {
    public static void main(String[] args) {
        car obj= (speed) ->System.out.println("broomm broom" + " "+ speed);
        obj.drive(89);
    }
}
