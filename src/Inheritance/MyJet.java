package Inheritance;


class Plane{
    public void takeOff(){
        System.out.println("Plane takeOff");
    }

    public void fly(){
        System.out.println("Plane fly");
    }

    public void landing(){
        System.out.println("Plane landing");
    }

}


class CargoPlane extends Plane{
    @Override
    public void fly() {
        System.out.println("Cargo Plane Fly At Lower Level");
    }
}

class PassengerPlane extends Plane{
    @Override
    public void fly() {
        System.out.println("Passenger Plane Fly At Middle Level");
    }
}

class FighterPlane extends Plane{
    @Override
    public void fly() {
        System.out.println("Fighter Plane Fly At Higher Level");
    }
}



public class MyJet {
    public static void main(String[] args) {
        CargoPlane c = new CargoPlane();
        PassengerPlane p = new PassengerPlane();
        FighterPlane f = new FighterPlane();
        c.fly();
        p.fly();
        f.fly();
    }
}
