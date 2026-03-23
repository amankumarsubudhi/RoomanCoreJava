package MyMultiThread;


class MyTaskChar implements Runnable{
    public void run(){
        for(char j=65;j<=75;j++){
            try {
                Thread.sleep(800);
                System.out.println(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyTaskNum implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(800);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyTaskTwoTable implements Runnable{
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


public class MyRunnable {

    public static void main(String[] args) {

        MyTaskNum t1 = new MyTaskNum();
        MyTaskChar t2 = new MyTaskChar();
        MyTaskTwoTable t3 = new MyTaskTwoTable();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();
        th2.start();
        th3.start();


    }

}
