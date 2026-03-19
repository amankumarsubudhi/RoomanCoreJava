package MyCustomException;

import java.util.Scanner;

class UnderAgeException extends Exception{

    public UnderAgeException(String message){

        super(message);

    }

}

class MyLicence{
     public void applyLicence() throws UnderAgeException{
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your age");
         int age = sc.nextInt();
         if (age < 18){
            throw  new UnderAgeException("You are not eligible as you are below 18");
         }
         else {
             System.out.println("You are eligible for licence kindly collect after 20 days");
         }
    }
}


public class MyOwnCustomException {

    public static void main(String[] args) {

        MyLicence ml = new MyLicence();
        try {
            ml.applyLicence();
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }

    }

}
