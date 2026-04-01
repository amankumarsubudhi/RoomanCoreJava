package MyFunInterface;



public class MyMain5 {
    public static void main(String[] args) {



        Runnable numja2 = ()->{
            for(int i=0;i<=10;i++){
                System.out.println("2 * " + i + " = " + (2*i));
            }
        };

        Runnable numja3 = ()->{
            for(int i=0;i<=10;i++){
                System.out.println("3 * " + i + " = " + (3*i));
            }
        };

        Runnable numja4 = ()->{
            for(int i=0;i<=10;i++){
                System.out.println("4 * " + i + " = " + (4*i));
            }
        };

        Thread t1 = new Thread(numja2);
        Thread t2 = new Thread(numja3);
        Thread t3 = new Thread(numja4);

        t1.start();
        t2.start();
        t3.start();

    }
}
