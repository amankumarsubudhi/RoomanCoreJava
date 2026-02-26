package Inheritance;

class bank{
    public void roi(){
        System.out.println("6.5 %");
    }

    public static void withdraw(){
        System.out.println("Bank Allows To Withdraw");
    }

}

class sbi extends bank{
    @Override
    public void roi() {
        System.out.println("8.5 %");
    }

    public static void withdraw(){
        System.out.println("Bank Allows To Withdraw");
    }

}

public class MethodOverriding {

    public static void main(String[] args) {
        sbi s = new sbi();
        s.roi();
        sbi.withdraw();
    }

}
