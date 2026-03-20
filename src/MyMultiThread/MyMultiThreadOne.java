package MyMultiThread;


class MT1 extends Thread{
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



class MT2 extends Thread{
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



class MT3 extends Thread{
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



public class MyMultiThreadOne {
    public static void main(String[] args) {
        MT1 mt1 = new MT1();
        MT2 mt2 = new MT2();
        MT3 mt3 = new MT3();
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
