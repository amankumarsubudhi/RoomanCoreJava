package Methods;

public class Calci2 {

    public void add(int x, int y) {

        int sum = x + y;
        System.out.println("Sum Is Printed In Add() = " + sum);

    }

    public static void main(String[] args) {
        Calci2 c = new Calci2();
        c.add(10, 20);
    }



}
