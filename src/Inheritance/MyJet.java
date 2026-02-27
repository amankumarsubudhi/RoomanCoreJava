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
    public void takeOff(){
        System.out.println("CargoPlane takeOff");
    }
    @Override
    public void fly() {
        System.out.println("Cargo Plane Fly At Lower Level");
    }
    @Override
    public void landing() {
        System.out.println("Cargo Plane Landing");
    }


     public void carryCargo(){
        System.out.println("Cargo Plane Carries Cargo.");
     }

}

class PassengerPlane extends Plane{
    @Override
    public void takeOff(){
        System.out.println("PassengerPlane takeOff");
    }

    @Override
    public void fly() {
        System.out.println("Passenger Plane Fly At Middle Level");
    }

    @Override
    public void landing() {
        System.out.println("Passenger Plane Landing");
    }

    public void carryPassenger(){
        System.out.println("Passenger Plane Carries Passenger.");
    }

}

class FighterPlane extends Plane{

    @Override
    public void takeOff() {
        System.out.println("FighterPlane takeOff");
    }

    @Override
    public void fly() {
        System.out.println("Fighter Plane Fly At Higher Level");
    }

    @Override
    public void landing() {
        System.out.println("FighterPlane Landing");
    }

    public void carryArms(){
        System.out.println("Fighter Plane Carries Weapons.");
    }

}



public class MyJet {
    public static void main(String[] args) {
        Plane mp;
        CargoPlane c = new CargoPlane();
        PassengerPlane p = new PassengerPlane();
        FighterPlane f = new FighterPlane();
        c.takeOff();
        c.fly();
        c.landing();
        c.carryCargo();
        System.out.println(" ");
        p.takeOff();
        p.fly();
        p.landing();
        p.carryPassenger();
        System.out.println(" ");
        f.takeOff();
        f.fly();
        f.landing();
        f.carryArms();

        mp = c;
        mp.takeOff();
        mp =  p;
        mp.takeOff();
        mp = f;
        mp.takeOff();
    }
}
