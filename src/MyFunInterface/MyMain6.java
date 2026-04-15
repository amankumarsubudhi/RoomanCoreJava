package MyFunInterface;

import java.util.function.Function;

public class MyMain6 {

    public static void main(String[] args) {

        Function<String, Integer> f1 = (s1) -> s1.length();
        int len = f1.apply("Rooman");
        System.out.println(len);
    }

}
