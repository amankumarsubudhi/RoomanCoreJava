package MyMultiThread;

class BPUT extends Thread {

    String class1 = "Java_Class_Room";
    String class2 = "AWS_Class_Room";

    public void run() {
        String name = Thread.currentThread().getName();

        if(name.equals("Java Trainer")) {
            javatraineracquired();
        }
        else{
            awstraineracquired();
        }
    }

    public void javatraineracquired() {
        synchronized(class2){
            try{
                System.out.println("Java Trainer Acquired AWS Class Room");
                Thread.sleep(2000);
                synchronized (class1){
                    System.out.println("Java Trainer Acquired Java Class Room");
                }
            }catch(Exception e){
                System.out.println("Some Error Occured in javatraineracquired");
            }
        }
    }


    public void awstraineracquired() {
        synchronized(class2){
            try{
                System.out.println("AWS Trainer Acquired AWS Class Room");
                Thread.sleep(2000);
                synchronized (class1){
                    System.out.println("AWS Trainer Acquired Java Class Room");
                }
            }catch(Exception e){
                System.out.println("Some Error Occured in awstraineracquired");
            }
        }
    }



}

public class MyDeadLock {
    public static void main(String[] args) {

        BPUT b1 = new BPUT();
        BPUT b2 = new BPUT();
        b1.setName("Java Trainer");
        b2.setName("AWS Trainer");

        b1.start();
        b2.start();

    }
}
