package Aggregation;

class Charger{
    private String brand;
    private float voltage;

    public Charger(String brand, float voltage){

        this.brand = brand;
        this.voltage = voltage;

    }


    public float getVoltage() {
        return voltage;
    }

    public String getBrand() {
        return brand;
    }
}



class  os{

    private String name;
    private int size;


    public os(String name, int size){
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}


class Mobile{

    os o = new os("Android",2);

    void hasA(Charger c){

        System.out.println("Accessing Charger Inside The Mobile");
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());

    }

}




public class MyAggregation {

    public static void main(String[] args) {

        Charger cg = new Charger("Realme",4.5f);

        Mobile mg = new Mobile();

//        mg=null;

        //Mobile Is Lost OS Also Lost Known As Composition
        mg.hasA(cg);

        System.out.println(mg.o.getName());
        System.out.println(mg.o.getSize());

        System.out.println(cg.getBrand());
        System.out.println(cg.getVoltage());

    }

}
