package MyMultiThread;


class MyThread{
    public void mt2000(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }


    public void mt500(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}

public class MyTask {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        System.out.println("Printing 1 To 10");
        for(int i=1;i<=10;i++){
            System.out.println(i);
            myThread.mt500();
        }

        myThread.mt2000();

        System.out.println(" ");

        System.out.println("Printing A To Z");
        for(int j=65;j<91;j++){
            System.out.println((char)j);
            myThread.mt500();
        }

        myThread.mt2000();

        System.out.println(" ");

        System.out.println("Printing 2 Table");
        for(int m = 1;m<=10;m++){

            int a = 2 * m;
            System.out.println( "2 * "+m+" = "+a);
            myThread.mt500();

        }

    }

}
