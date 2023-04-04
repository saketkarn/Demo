class Plane{
    public void takeoff(){
        System.out.println("Plane is taking off");
    }
    public void fly(){
        System.out.println("Plane is flying");
    }

    public void landing(){
        System.out.println("Plane is landing");
    }

}

class CargoPlane extends Plane{
    public void fly(){
        System.out.println("Cargo plane flies at lower height");
    }
}

class PassesngerPlane extends Plane{
    public void fly(){
        System.out.println("Passenger plane flies at medium height");
    }
}

class FighterPlane extends Plane{
    public void fly(){
        System.out.println("Fighter plane flies at medium height");
    }
}

class Airport{
    public void permit(Plane plane){
        plane.takeoff();
        plane.fly();
        plane.landing();
    }
}

public class LaunchPlane {
    public static void main(String[] args){
        CargoPlane cp=new CargoPlane();
        PassesngerPlane pp = new PassesngerPlane();
        FighterPlane fp = new FighterPlane();
        Airport a = new Airport();
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}
