package MyMultiThread;


class Producer extends Thread {

    Queue q1;

    public Producer(Queue k) {
        q1 = k;
    }

    public void run() {
        int i = 0;
        for (;;) {
            q1.store(i++);
        }
    }
}


    class Queue {
        int x;
        boolean is_data_present = false;

        synchronized public void store(int j) {
            try {
                if (is_data_present == false) {
                    x = j;
                    System.out.println("Producer Produced " + x);
                    is_data_present = true;
                    notify();
                    Thread.sleep(2000);
                } else {
                    wait();
                }
            } catch (Exception e) {
                System.out.println("Some Error Occured In Producer Side");
            }
        }

        synchronized public void retreive() {
            try {
                if (is_data_present == true) {
                    System.out.println("Consumer Consumed " + x);
                    is_data_present = false;
                    notify();
                    Thread.sleep(2000);
                } else {
                    wait();
                }
            } catch (Exception e) {
                System.out.println("Some Error Occured In Consumer Side");
            }
        }
    }

    class Consumer extends Thread {
        Queue q2;

        public Consumer(Queue q) {
            q2 = q;
        }

        @Override
        public void run() {
            for (;;) {
                q2.retreive();
            }
        }
    }


public class MyProCon {

    public static void main(String[] args) {

        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();

    }

}
