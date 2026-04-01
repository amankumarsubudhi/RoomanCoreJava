package MyFunInterface;

interface Opns1{
    int add(int a,int b);
}

public class MyMain2 {

    public static void main(String[] args) {

        /*Opns1 ref1 = (int a,int b)->{
            int c = a+b;
            return c;
        };*/

        Opns1 ref1 = (int a, int b)->a+b;

        int res = ref1.add(300,200);
        System.out.println("Result = " +res);

    }

}
