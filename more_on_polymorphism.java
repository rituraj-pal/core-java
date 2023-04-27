class aeroPlane{
    public void takeOff(){
        System.out.println("aeroplane is taking off");
    }
    public void fly(){
        System.out.println("aerplane is flying");
    }

}
class passengerPlane extends aeroPlane
{
    public void takeOff(){
        System.out.println("passenger plane needs shorter runway");
    }
    public void fly(){
        System.out.println("passenger plane flies at higher height");
    }


}
class cargoPlane extends aeroPlane
{
    public void takeOff(){
        System.out.println("cargoPlane needs longer runway");
    }
    public void fly(){
        System.out.println("cargoPlane flies at shorter  height");
    }

}
class fighterPlane extends aeroPlane
{
    public void takeOff(){
        System.out.println("fighter plane needs medium runway");
    }
    public void fly(){
        System.out.println("fighter plane flies at medium height");
    }

}
 class helicopter{
    public void poly(aeroPlane ref){
        ref.takeOff();
        ref.fly();
        System.out.println("----------------------");
    }


}
public class more_on_polymorphism{
    public static void main(String[] args) {
        passengerPlane pp= new passengerPlane();
        cargoPlane cp= new cargoPlane();
        fighterPlane fp= new fighterPlane();
        // pp.takeOff();
        // pp.fly();
        helicopter hp= new helicopter();
        hp.poly(pp);
        hp.poly(cp);
        hp.poly(fp);
        
    }

}