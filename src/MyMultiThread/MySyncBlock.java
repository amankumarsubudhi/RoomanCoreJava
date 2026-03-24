package MyMultiThread;

class MySyncThread implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " Accessing The Line 1");
            Thread.sleep(1500);
            System.out.println(name + " Accessing The Line 2");
            Thread.sleep(1500);
            System.out.println(name + " Accessing The Line 3");
            Thread.sleep(1500);
            System.out.println(name + " Accessing The Line 4");
            Thread.sleep(1500);
            synchronized (this) {
                System.out.println(name + " Accessing The Line 5");
                Thread.sleep(1500);
                System.out.println(name + " Accessing The Line 6");
                Thread.sleep(1500);
                System.out.println(name + " Accessing The Line 7");
                Thread.sleep(1500);
                System.out.println(name + " Accessing The Line 8");
            }
            Thread.sleep(1500);
            System.out.println(name + " Accessing The Line 9");
            Thread.sleep(1500);
            System.out.println(name + " Accessing The Line 10");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



public class MySyncBlock {

    public static void main(String[] args) {
        MySyncThread st =  new MySyncThread();

        Thread jj = new Thread(st);
        Thread aa =  new Thread(st);
        Thread cc =  new Thread(st);

        jj.setName("Java");
        aa.setName("AWS");
        cc.setName("Cyber Security");

        jj.start();
        aa.start();
        cc.start();


    }

}
