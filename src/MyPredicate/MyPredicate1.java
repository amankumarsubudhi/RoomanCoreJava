package MyPredicate;

import java.util.function.Predicate;

public class MyPredicate1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,10,15,20,25,27,28,30,36};
        Predicate<Integer> p1 = num -> num % 2 == 0;

        for (int n : a) {
            if(p1.negate().test(n)){
                System.out.println("Odd No Is " + n);
            }
        }
    }
}
