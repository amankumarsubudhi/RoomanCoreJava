package MyMultiThread;

class TypingThread extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
            try {
                System.out.println("User Is Typing " + i);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AutoSaveThread extends Thread {
    public void run() {
        for(;;) {
            try {
                System.out.println("Auto Save Executed Successfully");
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AutoCompltionThread extends Thread {
    public void run() {
        for(;;) {
            try {
                System.out.println("Auto Complation Executed Successfully");
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyDaemonThread {

    public static void main(String[] args) {
        TypingThread t = new TypingThread();
        AutoCompltionThread ac = new AutoCompltionThread();
        ac.setDaemon(true);
        AutoSaveThread as = new AutoSaveThread();
        as.setDaemon(true);
        t.start();
        ac.start();
        as.start();
    }

}
