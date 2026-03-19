package MyExceptions;

import java.util.Scanner;

class Demo05{
    public void m05() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Connection 2 Established");
        System.out.println("Enter Number a");
        int a = sc.nextInt();
        System.out.println("Enter Number b");
        int b = sc.nextInt();
        int c = a/b;
        System.out.println(c);
        System.out.println("Connection 2 Terminated");
    }
}


class Demo04{
    public void m04() throws Exception{
        Demo05 d05 = new Demo05();
        d05.m05();
    }
}


public class DuckingException {
    public static void main(String[] args) {
        try {
            Demo04 d04 = new Demo04();
            d04.m04();
        } catch (Exception e) {
            System.out.println("Exception Handled in The main()");
            e.printStackTrace();
        }
    }
}
