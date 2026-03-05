package C;

import A.Abc;

public class Xyz{
    public void m2(){
        Abc b = new Abc();

        // showing error because it marked as private
        //System.out.println(b.a);

        // showing error because it marked as (package / default)
        //System.out.println(b.b);

        // showing error because it marked as protected
        //System.out.println(b.c);


        System.out.println(b.d);
    }
}


