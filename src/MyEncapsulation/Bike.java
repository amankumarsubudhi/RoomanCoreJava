package MyEncapsulation;

public class Bike {
    private String name;
    private String color;
    public Bike(){
        this("BMW S1000 RR","Black");
    }
    public Bike(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
