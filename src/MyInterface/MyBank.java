package MyInterface;

interface ATM{
    public abstract void deposit();
    public abstract void withdraw();
    public abstract void transfer();
    public abstract void checkBalance();
}


class SBI implements ATM{

    @Override
    public void deposit() {
        System.out.println("Deposited to SBI");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawn from SBI");
    }

    @Override
    public void transfer() {
        System.out.println("Transfer from SBI");
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking Balance in SBI");
    }

    public void specialROI(){
        System.out.println("Special ROI");
    }
}

class Canara implements ATM{

    @Override
    public void deposit() {
        System.out.println("Deposited to Canara");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawn from Canara");
    }

    @Override
    public void transfer() {
        System.out.println("Transfer from Canara");
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking Balance in Canara");
    }
}

class Axis implements ATM{

    @Override
    public void deposit() {
        System.out.println("Deposited to Axis");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawn from Axis");
    }

    @Override
    public void transfer() {
        System.out.println("Transfer from Axis");
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking Balance in Axis");
    }
}


class PlutoneMall{
    public static void getInstalled(ATM a){
        a.deposit();
        a.withdraw();
        a.checkBalance();
        a.transfer();
    }
}


public class MyBank {


    public static void main(String[] args) {
        SBI sbi = new SBI();
        Canara cn = new Canara();
        Axis ax = new Axis();
        PlutoneMall.getInstalled(sbi);
        PlutoneMall.getInstalled(cn);
        PlutoneMall.getInstalled(ax);


        ATM a = new SBI();
        a.deposit();
        a.withdraw();
        a.checkBalance();
        a.transfer();
        ((SBI) a).specialROI();



    }




}
