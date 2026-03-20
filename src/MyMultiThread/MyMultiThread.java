package MyMultiThread;

class MyTask1 extends Thread{
    public void run(){
        for(int j=1;j<=10;j++){
            try {
                Thread.sleep(800);
                System.out.println(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MyTask2 extends Thread{
    public void run(){
        for(int i=65;i<91;i++){
            try {
                Thread.sleep(800);
                System.out.println((char)i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



class MyTask3 extends Thread{
    public void run(){
        for(int m = 1;m<=10;m++){
            try {
                int a = 2 * m;
                System.out.println( "2 * "+m+" = "+a);Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}





public class MyMultiThread {
    public static void main(String[] args) {

        MyTask1 t1 = new MyTask1();
        MyTask2 t2 = new MyTask2();
        MyTask3 t3 = new MyTask3();
        t1.start();
        t2.start();
        t3.start();


    }
}
