package MyFunInterface;

import java.util.function.Function;

public class MyMain7 {
    public static void main(String[] args) {

        Function<String, String> f2 = (s2) ->s2.replaceAll(" ", "");
        String s = f2.apply("The Rooman Tech Pvt Ltd");
        System.out.println(s);

    }
}
