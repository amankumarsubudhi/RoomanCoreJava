package Inheritance;



class CreditCard{
    public void creditLimit(){
        System.out.println("Credit Limit Is Upto 50000");
    }
}

class AmericaExpress extends CreditCard{

    public void creditLimit(){
        System.out.println("Credit Limit Is Upto 100000000");
        super.creditLimit();
    }
}



public class MyTransaction {


    public static void main(String[] args) {
        AmericaExpress a = new AmericaExpress();
        a.creditLimit();
    }

}
