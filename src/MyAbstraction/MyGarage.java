package MyAbstraction;

abstract class Bike01{

    public abstract void ignite01();

    public abstract void changeGear01();

    public abstract void accelerate01();

    public abstract void applyBreaks01();

}


abstract class SuperBike extends Bike01{



}


abstract class Hayabusa extends Bike01{

    @Override
    public void ignite01() {
        System.out.println("Hayabusa Ignited Successfully");
    }

    @Override
    public void changeGear01() {
        System.out.println("Hayabusa Changed Gear Successfully");
    }

}

class Hayabusa1 extends Hayabusa{


    @Override
    public void accelerate01() {
        System.out.println("Hayabusa Accelerated Successfully");
    }

    @Override
    public void applyBreaks01() {
        System.out.println("Hayabusa Applied Breaks Successfully");
    }


}



public class MyGarage {


    public static void main(String[] args) {

        Bike01 hb = new Hayabusa1();
        hb.ignite01();
        hb.changeGear01();
        hb.accelerate01();
        hb.applyBreaks01();


    }


}
