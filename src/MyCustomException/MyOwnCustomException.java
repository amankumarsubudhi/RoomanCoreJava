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




class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}


class withdraw{
     public void withdrawMoney() throws InsufficientBalanceException{
         int balance = 85867;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount You Want to Withdraw");
        int wb = sc.nextInt();
        if (wb > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Withdraw " + wb + " Successful");
        }
    }
}




public class MyOwnCustomException {

    public static void main(String[] args) {

        MyLicence ml = new MyLicence();
        withdraw w = new withdraw();
        try {
            w.withdrawMoney();
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        try {
            ml.applyLicence();
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }

    }

}
