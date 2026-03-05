package MyExceptions;

import java.util.Scanner;

public class MyExp3 {
    public static void main(String[] args) {
        System.out.println("Connection Established");
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        try {
            System.out.println("Enter The Index You Need To Access");
            int index = sc.nextInt();
            sc.close();
            System.out.println(a[index]);
        } catch (Exception e) {
            System.out.println("Entered Index Number Is Greater Than The Existing Array Index  ");
        }
        System.out.println("Connection Terminated");
    }
}
