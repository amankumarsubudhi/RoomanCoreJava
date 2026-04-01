package MyFunInterface;

interface Calc1{
    int mul(int a,int b);
}

public class MyMain3 {

    public static void main(String[] args) {

//        Calc1 m = (int a,int b)->a*b;
        Calc1 m = (int a,int b)->a*b;

        int res = m.mul(5,4);
        System.out.println("Result = "+res);
    }

}
