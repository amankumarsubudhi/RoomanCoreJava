package Constructors;

class Bike{
    String name;
    double mileage;
    int model;


    public  Bike(String name) {
        this();
        this.name = name;
        System.out.println("Inside Name Constructor");
    }

    public Bike(Double mileage){
        this.mileage = mileage;
        System.out.println("Inside Mileage Constructor");
    }

    public Bike(){
        this(2025);
        System.out.println("Inside Default Constructor");
    }

    public Bike(int model){
        this(30.0);
        this.model = model;
        System.out.println("Inside Model Constructor");
    }

   public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public int getModel() {
        return model;
    }
}

public class SevicePoint {


    public static void main(String[] args) {
        Bike b = new Bike("Bullet");
        System.out.println("Name : " + b.getName());
        System.out.println("Mileage : " + b.getMileage());
        System.out.println("Model : " + b.getModel());
    }


}
