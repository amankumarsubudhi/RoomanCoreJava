package MyMultiThread;


class Fourja extends Thread{
    public void run(){
        for(int m = 1;m<=10;m++){
            try {
                int a = 4 * m;
                System.out.println( "4 * "+m+" = "+a);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Threeja extends Thread{
    public void run(){
        for(int m = 1;m<=10;m++){
            try {
                int a = 3 * m;
                System.out.println( "3 * "+m+" = "+a);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Twoja extends Thread{
    public void run(){
        for(int m = 1;m<=10;m++){
            try {
                int a = 2 * m;
                System.out.println( "2 * "+m+" = "+a);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MyJoinOne {

    public static void main(String[] args) {
        Twoja twoja = new Twoja();
        Threeja threeja = new Threeja();
        Fourja fourja = new Fourja();

        try {
            twoja.start();
            twoja.join();

            threeja.start();
            threeja.join();

            fourja.start();
            fourja.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
