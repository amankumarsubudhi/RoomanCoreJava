package MyMultiThread;


class TwoTab implements Runnable{
    public void run(){
        for(int n = 1;n<=10;n++){
            try {
                int a = 2 * n;
                System.out.println( "2 * "+n+" = "+a);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreeTab implements Runnable{
    public void run(){
        for(int n = 1;n<=10;n++){
            try {
                int a = 3 * n;
                System.out.println( "3 * "+n+" = "+a);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class FourTab implements Runnable{
    public void run(){
        for(int n = 1;n<=10;n++){
            try {
                int a = 4 * n;
                System.out.println( "4 * "+n+" = "+a);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MyRunnableOne {
    public static void main(String[] args) {

        TwoTab tabTwo = new TwoTab();
        ThreeTab tabThree = new ThreeTab();
        FourTab tabFour = new FourTab();

        Thread tab2 = new Thread(tabTwo);
        Thread tab3 = new Thread(tabThree);
        Thread tab4 = new Thread(tabFour);

        tab2.start();
        tab3.start();
        tab4.start();


    }
}
