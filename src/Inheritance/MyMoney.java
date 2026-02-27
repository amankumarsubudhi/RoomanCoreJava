package Inheritance;

class RBI{
    public void deposit(){
        System.out.println("deposit");
    }
    public void withdraw(){
        System.out.println("withdraw");
    }
    public void transfer(){
        System.out.println("transfer");
    }
}

class SBI extends RBI{
    public void deposit(){
        System.out.println("SBI Deposit Successfully");
    }
    public void withdraw(){
        System.out.println("SBI Withdraw  Successfully");
    }
    public void transfer(){
        System.out.println("SBI Transfer Successfully");
    }
}

class AXIS extends RBI{
    public void deposit(){
        System.out.println("AXIS Deposit Successfully");
    }
    public void withdraw(){
        System.out.println("AXIS Withdraw  Successfully");
    }
    public void transfer(){
        System.out.println("Axis Transfer Successfully");
    }
}

class HDFC extends RBI{
    public void deposit(){
        System.out.println("HDFC Deposit Successfully");
    }
    public void withdraw(){
        System.out.println("HDFC Withdraw  Successfully");
    }
    public void transfer(){
        System.out.println("HDFC Transfer Successfully");
    }
}

class Transaction {
    public static void allow(RBI r){
        System.out.println("Allowed To Do Transaction");
        r.deposit();
        r.withdraw();
        r.transfer();
        System.out.println(" ");
    }
}

public class MyMoney {

    public static void main(String[] args) {


        SBI s = new SBI();
        AXIS a = new AXIS();
        HDFC h = new HDFC();

        Transaction.allow(s);
        Transaction.allow(a);
        Transaction.allow(h);




    }


}
