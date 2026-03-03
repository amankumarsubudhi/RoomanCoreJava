package MyInterface;

import java.util.Scanner;

interface Calculator{
    public abstract void add();
    public abstract void sub();
}


class Calci implements Calculator{
    @Override
    public void add(){
        int a = 100, b = 200;
        System.out.println("a + b = "+(a+b));
    }
    @Override
    public void sub(){
        int a = 200, b = 100;
        System.out.println("a - b = "+(a-b));
    }
}


class SciCalci implements Calculator{
    Scanner sc = new Scanner(System.in);
    @Override
    public void add(){
        System.out.println("Enter the value for a :");
        int a = sc.nextInt();
        System.out.println("Enter the value for b : ");
        int b = sc.nextInt();
        System.out.println("a + b = "+(a+b));
    }
    @Override
    public  void sub(){
        System.out.println("Enter the value for a :");
        int a = sc.nextInt();
        System.out.println("Enter the value for b : ");
        int b = sc.nextInt();
        System.out.println("a - b = "+(a-b));
    }
}

class MathCalci implements Calculator{

    Scanner sc = new Scanner(System.in);
    @Override
    public void add(){
        System.out.println("Enter the value for a that is  >= 100");
        int a = sc.nextInt();
        if(a>=100){
            System.out.println("Enter the value for b :");
            int b =  sc.nextInt();
            System.out.println("Addition = " + (a+b));
        }
        else{
            System.out.println("a can't be <100");
        }
    }
    @Override
    public void sub(){
        System.out.println("Enter the value for a that is >= 100 : ");
        int a = sc.nextInt();
        if(a>=100){
            System.out.println("Enter the value for b :");
            int b = sc.nextInt();
            System.out.println("Subtraction = " + (a-b));
        }
        else{
            System.out.println("a can't be <100");
        }

    }
}




public class MyOprn {


    public static void main(String[] args) {

        Calci c1 = new Calci();
        SciCalci c2 = new SciCalci();
        MathCalci c3 = new MathCalci();
        c1.add();
        c1.sub();
        System.out.println(" ");
        c2.add();
        c2.sub();
        System.out.println(" ");
        c3.add();
        c3.sub();

    }


}
