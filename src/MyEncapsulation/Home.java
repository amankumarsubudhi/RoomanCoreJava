package MyEncapsulation;

public class Home {

    public static void main(String[] args) {
        Tv t = new Tv();
        t.setVolume(50);
        t.setBrightness(60);
        System.out.println(t.getVolume());
        System.out.println(t.getBrightness());
        Fan f = new Fan();
        f.setSpeed(5);
        System.out.println(f.getSpeed());
    }



}
