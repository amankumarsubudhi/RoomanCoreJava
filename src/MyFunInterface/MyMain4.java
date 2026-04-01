package MyFunInterface;

@FunctionalInterface
interface sq{
    int square(int a);
}

public class MyMain4 {

    public static void main(String[] args) {

        sq s = a->a*a;
        // Since It Taking Single Parameter Remove The ()Parenthesis Also

        int res = s.square(8);
        System.out.println("Result = "+res);

    }

}
