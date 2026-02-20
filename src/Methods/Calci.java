package Methods;

public class Calci {

    public void add(){
        int a = 100, b= 200;
        int sum = a+b;
        System.out.println("Result Sum Printed Inside add() = " + sum);
    }

    public static void main(String[] args) {
        Calci c = new Calci();
        c.add();
    }


}
