package MyMultiThread;

import java.util.Scanner;

class TestThread extends Thread {
    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        if(name.equals("printTable")){
            printTable();
        } else if (name.equals("printChar")) {
            printChar();
        } else if (name.equals("addNumber")) {
            addNumber();
        } else {
            printNumber();
        }

    }

    public void addNumber(){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        try {
            System.out.print("Enter The Value of A : ");
            a = sc.nextInt();
            System.out.print("Enter The Value of B : ");
            b = sc.nextInt();
            int c =  a + b;
            System.out.println("Addition is : " + c);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void printTable(){
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

    public void printChar(){
        for(int i=65;i<91;i++){
            try {
                Thread.sleep(800);
                System.out.println((char)i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printNumber(){
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

public class MySingleRun {

    public static void main(String[] args) {
        TestThread t01 = new TestThread();
        TestThread t02 = new TestThread();
        TestThread t03 = new TestThread();
        TestThread t04 = new TestThread();
        t01.setName("printTable");
        t02.setName("printChar");
        t03.setName("printNumber");
        t04.setName("addNumber");

        t01.start();
        t02.start();
        t03.start();
        t04.start();


    }

}
