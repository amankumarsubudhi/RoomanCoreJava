package MyEncapsulation;

class Tv {

    private int volume;
    private int brightness;

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness <= 60) {
            this.brightness = brightness;
        }
        else {
            System.out.println("Brightness can't be greater than 60");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= 50) {
            this.volume = volume;
        }
        else {
            System.out.println("Volume can't be greater than 50");
        }
    }

    public void watchMovie(){
        System.out.println("Watching movie in a Tv");

}
}