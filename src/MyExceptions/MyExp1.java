package MyExceptions;


import java.util.Scanner;

public class MyExp1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Connection Established");
        try{
            System.out.println("Enter Your Age");
            int age = scan.nextInt();
            scan.close();
            System.out.println("Age Entered Is " + age);
        }
        catch (Exception e){
            System.out.println("Age Can't Be A String Kindly Provide Integer");
        }
        System.out.println("Connection Terminated Gracefully");
    }
}
