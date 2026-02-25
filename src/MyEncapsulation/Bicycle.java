package MyEncapsulation;

public class Bicycle {
    String name;
    int cost;
    public Bicycle(String name) {
        this(85000);
        System.out.println("Inside Name Constructor");
        this.name = name;
    }

    public Bicycle(int cost) {
        this();
        System.out.println("Inside Cost Constructor");
        this.cost = cost;
    }

    public Bicycle() {
        System.out.println("Inside Zero Parameterize Constructor");
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
