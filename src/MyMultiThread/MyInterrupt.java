package MyMultiThread;

class MyBeta extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Line 1");
            Thread.sleep(1200);

            System.out.println("Line 2");
            Thread.sleep(1200);

            System.out.println("Line 3");
            Thread.sleep(1200);

            System.out.println("Line 4");
            Thread.sleep(1200);

            System.out.println("Line 5");
            Thread.sleep(1200);
            Thread.currentThread().interrupt();

            System.out.println("Line 6");
            Thread.sleep(1200);

            System.out.println("Line 7");
            Thread.sleep(1200);

            System.out.println("Line 8");
            Thread.sleep(1200);

            System.out.println("Line 9");
            Thread.sleep(1200);

            System.out.println("Line 10");
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            System.out.println("Thread Got Interrupted");
        }
    }
}

public class MyInterrupt {

    public static void main(String[] args) {
        System.out.println("Main Started");
        MyBeta myBeta = new MyBeta();
        myBeta.start();
        try {
            myBeta.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Ended");
    }

}
