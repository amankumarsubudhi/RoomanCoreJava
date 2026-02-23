package MyStringPack;

import java.util.Scanner;

public class MyInputs1 {

    public static void main(String[] args) {
        System.out.println("Enter One Char");
        String s = new Scanner(System.in).next();
        System.out.println(s);
        char c = s.charAt(0);
        System.out.println(c);

        System.out.println("Enter One Char");
        char d = new Scanner(System.in).next().charAt(0);
        System.out.println(d);

        System.out.println("Enter a string");
        String i = new Scanner(System.in).next().toUpperCase();
        System.out.println(i);
        System.out.println(i.toLowerCase());

    }



}
