package MyEncapsulation;

class Fan {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed <= 5){
            this.speed = speed;
        }
        else {
            System.out.println("Speed can't be greater than 5");
        }

    }
}
