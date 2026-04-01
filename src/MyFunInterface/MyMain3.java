package MyFunInterface;

@FunctionalInterface
interface Calc1{
    int mul(int a,int b);
//    int mul(int m,int n);
    /*
    * // After Marked The Interface As Functional Interface
         We Can't Have More Than One Abstarct Method In The Interface
         * But We Can Have default method, static method, private method */
}

public class MyMain3 {

    public static void main(String[] args) {

//        Calc1 m = (int a,int b)->a*b;
        Calc1 m = (int a,int b)->a*b; // Cannot Able To Use Lambda Function When There Is 2 Abstract Methods Present In Interface.

        int res = m.mul(5,4);
        System.out.println("Result = "+res);
    }

}
