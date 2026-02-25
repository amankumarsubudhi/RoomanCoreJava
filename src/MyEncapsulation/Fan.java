package MyEncapsulation;

class Fan {

    private int speed;

    public Fan(int speed) {
        if(speed <= 5){
            this.speed = speed;
        }
        else {
            System.out.println("Speed can't be greater than 5");
        }
    }
}
