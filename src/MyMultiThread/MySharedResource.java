package MyMultiThread;

class WhiteBoard implements Runnable {

    @Override
    synchronized public void run() {

        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " Trying To Access White Board");
            Thread.sleep(800);
            System.out.println(name + " Got The Access To White Board");
            for(int i=0;i<=10;i++){
                System.out.println(name + " Writing On The Board");
                Thread.sleep(500);
            }
            System.out.println(name + " Completed Accessing The Board");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}



public class MySharedResource {

    public static void main(String[] args) {
        WhiteBoard w = new WhiteBoard();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("Java");
        t2.setName("AWS");
        t3.setName("Cyber Security");

        t1.start();
        t2.start();
        t3.start();

    }

}
