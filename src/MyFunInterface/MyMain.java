package MyFunInterface;

interface Opns{
    void add(int a,int b);
}

/*class Calc implements Opns{
    @Override
    public void add(int a,int b) {
        int c = a+b;
        System.out.println("Sum Is " + c);
    }
}*/

public class MyMain {

    public static void main(String[] args) {

        /*Calc c = new Calc();
        c.add(800,200);*/

        Opns ref = (int a, int b)->{
            int sum = a+b;
            System.out.println("Sum Is " + sum);
        };

        ref.add(800,200);

    }

}
