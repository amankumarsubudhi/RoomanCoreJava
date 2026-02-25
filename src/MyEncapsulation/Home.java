package MyEncapsulation;

public class Home {

    public static void main(String[] args) {
        Tv t = new Tv();
        t.setVolume(50);
        t.setBrightness(60);
        System.out.println(t.getVolume());
        System.out.println(t.getBrightness());
        Fan f = new Fan(50);
        Car c = new Car();
        Bike b = new Bike();
        System.out.println("Bike Name = " + b.getName());
        System.out.println("Bike Color = " + b.getColor());
    }
}
