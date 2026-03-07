package MyExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class Demo3{
    public void m3(){
        System.out.println("Connection 3 Established");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Entered Age Is = " + age);

        // Surrounded with try and catch block

        /*try {
            System.out.println("Enter Your Age");
            int age = sc.nextInt();
            System.out.println("Entered Age Is = " + age);
        } catch (InputMismatchException e) {
            System.out.println("Input Can't Be A String");
            System.out.println("Exception Handled In m3()");
        }*/
        System.out.println("Connection 3 Terminated");
    }
}

class Demo2{
    public void m2(){
        System.out.println("Connection 2 Established");
        Demo3 d3 = new Demo3();
        d3.m3();

        // Surrounded with try and catch block

        /*try {
            d3.m3();
        } catch (InputMismatchException e) {
            System.out.println("Exception Handled In m2()");
            System.out.println("Input Can't Be A String");
        }*/
        System.out.println("Connection 2 Terminated");
    }
}

class Demo1{
    public void m1(){
        System.out.println("Connection 1 Established");
        Demo2 d2=new Demo2();

        // Surrounded with try and catch block

        try {
            d2.m2();
        } catch (InputMismatchException e) {
            System.out.println("Exception Handled In m1()");
            System.out.println("Input Can't Be A String");
        }
        System.out.println("Connection 1 Terminated");
    }
}

public class MyExcpProp {

    public static void main(String[] args) {
        System.out.println("Main Connection Established");
        Demo1 d = new Demo1();
        d.m1();
        System.out.println("Main Connection Terminated");
    }

}
