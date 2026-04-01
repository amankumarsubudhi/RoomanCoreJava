package MyPredicate;

import java.util.function.Predicate;

public class MyPredicate {

    public static void main(String[] args) {

        int[] a = {1,2,3,10,15,20,25,27,28,30,36};

        String[] s = {"Brahmapur", "Ganjam", "Odisha", "India", "Asia"};

        Predicate<Integer> e = num->num%2==0;

        Predicate<Integer> o = num->num%2!=0;

        Predicate<String> st = str->str.toLowerCase().startsWith("a");

        for(int n:a){
            if(e.test(n)){
                System.out.println(n + " Is An Even Number");
            }
        }

        for(int n:a){
            if(o.test(n)){
                System.out.println(n + " Is An Odd Number");
            }
        }

        for (String n:s){
            if(st.test(n)){
                System.out.println(n);
            }
        }

    }

}
