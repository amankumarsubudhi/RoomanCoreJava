package MyDemo;

import java.util.Scanner;

public class MyLastIndexOf {

    public static void main(String[] args) {

        String a = "rooman";
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        System.out.println("Enter The Char, You Want To Know The Index");
        char b = sc.next().charAt(0);
        sc.close();
        for (int i = a.length()-1; i >= 0; i--) {
            if (a.charAt(i) == b) {
                System.out.println(i);
                return;
            }
        }
        System.out.printf("-1");

    }

}
