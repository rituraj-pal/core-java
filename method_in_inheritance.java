class Aeroplane{
    public void Takeoff(){
        System.out.println("aeroplane is taking off");
    }
    public void fly(){
        System.out.println("aerplane is flying");
    }

}
class Cargoplane extends Aeroplane
{
     public void fly (){
        System.out.println("aeroplane is flying at low level");

    }
    public void CarryGoods(){
        System.out.println("cargoplane carry goods");
    }

}
class Passengerplane extends Aeroplane
{
    public void fly(){
        System.out.println("aerplane is flying at higher level");
    }
    public void CarryPassenger(){
        System.out.println(" aerplane carry passenger");
    }

}
public class method_in_inheritance {
    public static void main(String[] args) {
        Cargoplane cp= new Cargoplane();
        cp.Takeoff();
        cp.fly();
        
    }
}
