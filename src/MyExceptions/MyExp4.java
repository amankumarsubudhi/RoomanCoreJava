package MyExceptions;

import java.util.Scanner;

public class MyExp4 {
    public static void main(String[] args) {
        System.out.println("Connection Established");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of An Array (Maximum Limit 50)");
        try {
            int n = sc.nextInt();
            if(n>50) {
                throw new Exception();
            }
            int[] arr = new int[n];
            System.out.println("Length Of This Array Is " + arr.length);
        } catch (Exception e) {
            System.out.println("Maximum Limit Exceeded");
        }
        sc.close();
        System.out.println("Connection Terminated");
    }
}
