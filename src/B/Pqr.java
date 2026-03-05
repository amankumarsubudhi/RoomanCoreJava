package B;


import A.Abc;

public class Pqr extends Abc {
    @Override
    public void m1(){
        // showing error because it marked as private
        System.out.println(a);

        // showing error because it marked as (package / default)
        System.out.println(b);


        System.out.println(c);
        System.out.println(d);
    }
}

