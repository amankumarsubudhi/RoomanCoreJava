package MyAbstraction;


abstract class Plane01{
    public abstract void takeoff01();
    public abstract void fly01();
    public abstract void land01();
}



class CargoPlane extends Plane01 {
    @Override
    public void takeoff01() {
        System.out.println("CargoPlane Takeoff Successfully");
    }
    @Override
    public void fly01() {
        System.out.println("CargoPlane Flying Successfully");
    }
    @Override
    public void land01() {
        System.out.println("CargoPlane Landed Successfully");
    }

}

class PassengerPlane extends Plane01 {
    @Override
    public void takeoff01() {
        System.out.println("PassengerPlane Takeoff  Successfully");
    }

    @Override
    public void fly01() {
        System.out.println("PassengerPlane Flying Successfully");
    }

    @Override
    public void land01() {
        System.out.println("PassengerPlane Landed Successfully");
    }


}

class FighterPlane extends Plane01 {

    @Override
    public void takeoff01() {
        System.out.println("FighterPlane Takeoff  Successfully");
    }
    @Override
    public void fly01() {
        System.out.println("FighterPlane Flying Successfully");
    }
    @Override
    public void land01() {
        System.out.println("FighterPlane Landed Successfully");
    }


}




public class Abstraction {


    public static void main(String[] args) {

       CargoPlane c=new CargoPlane();
       c.takeoff01();
       c.fly01();
       c.land01();

        System.out.println(" ");

       PassengerPlane p=new PassengerPlane();
       p.takeoff01();
       p.fly01();
       p.land01();

        System.out.println(" ");

       FighterPlane f=new FighterPlane();
       f.takeoff01();
       f.fly01();
       f.land01();

        System.out.println(" ");

    }


}
