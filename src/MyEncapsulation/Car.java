package MyEncapsulation;

public class Car {
    private int gear;
    private int acceleration;
    public Car(){
        this(5,60);
    }
    public Car(int gear, int acceleration) {
        if (gear <= 4 && acceleration <= 50) {
            this.gear = gear;
            this.acceleration = acceleration;
        }
        else{
            System.out.println("Gear And Acceleration cant't be greater than 4 & 50 Respectively");
        }
    }
}
