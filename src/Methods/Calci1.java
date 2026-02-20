package Methods;

public class Calci1 {

    public int add(){
        int a = 1000;
        int b = 2000;
        int sum = a+b;
        return sum;
    }


    public static void main(String[] args) {
        Calci1 c = new Calci1();
        int res = c.add();
        System.out.println("Sum Is Printed In Main () = " + res);
    }


}
