package Assignment;

public class PassByReference1 {

    String brand;
    double cost;

    public static void main(String[] args) {
        PassByReference1 c = new PassByReference1();
        c.brand = "BMW";
        c.cost = 8000000.88;
        PassByReference1 b;
        b=c;
        System.out.println(c.brand);
        System.out.println(c.cost);
        System.out.println(b.brand);
        System.out.println(b.cost);
        b.brand="TATA";
        b.cost = 6000000.00;
        System.out.println(c.brand);
        System.out.println(c.cost);
    }




}
