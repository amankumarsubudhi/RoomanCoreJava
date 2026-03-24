package MyMultiThread;


class p1 extends Thread implements Runnable{
    public void run(){
        for(int p=1;p<=10;p++){
            try {
                Thread.sleep(500);
                System.out.println(p);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class p2 extends Thread implements Runnable{
    public void run(){
        for(int q=20;q<=30;q++){
            try {
                Thread.sleep(500);
                System.out.println(q);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class p3 extends Thread implements Runnable{
    public void run(){
        for(int r=40;r<=40;r++){
            try {
                Thread.sleep(500);
                System.out.println(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class MyRunnableTwo {
    public static void main(String[] args) {
        p1 p = new p1();
        p2 pp = new p2();
        p3 ppp = new p3();

        p.start();
        pp.start();
        ppp.start();

    }
}
