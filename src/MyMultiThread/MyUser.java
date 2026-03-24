package MyMultiThread;


class MyDemo extends Thread {
    public void run() {
        for(;;) {
            try {
                Thread.sleep(1000);
                System.out.println("User Thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyUser {

    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        MyDemo d1 = new MyDemo();
        d1.start();
        System.out.println("Main Thread Ended");
    }

}
