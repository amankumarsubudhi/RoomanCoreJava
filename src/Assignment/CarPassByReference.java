package Assignment;

public class CarPassByReference {

    String brand;
    double cost;

    public void exchange(CarPassByReference a){

        a.brand = "BMW";
        a.cost = 5000000;

    }

    public static void main(String[] args) {
        CarPassByReference c = new CarPassByReference();
        c.brand = "Audi";
        c.cost = 3000000;
        System.out.println(c.brand);
        System.out.println(c.cost);

        c.exchange(c);

        System.out.println(c.brand);
        System.out.println(c.cost);

    }



}
