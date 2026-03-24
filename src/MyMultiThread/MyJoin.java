package MyMultiThread;

class MyAlpha1001 extends Thread {
    public void run() {

        for(char c=65;c<=75;c++){
            System.out.println("My Alpha Thread Started");
            try {
                System.out.println(c);
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("My Alpha Thread Ended");
        }
    }
}


public class MyJoin {

    public static void main(String[] args) {
        try {
            MyAlpha1001 ma0 = new MyAlpha1001();
            System.out.println("Main Thread Started");
            System.out.println("Database Connection Established");
            ma0.start();
            ma0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Database Connection Terminated");
        System.out.println("Main Thread Ended");
    }

}
