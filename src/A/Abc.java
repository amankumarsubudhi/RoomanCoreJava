package A;

// class should be public or (default/package) only
public class Abc{

    // variable marked private only accessible within the same class
    private int a;

    /* package default variable can be accessed in different classes but
    should be in the same package only*/
    int b;

    /* variable marked as protected can be
    access through inheritance only*/
    protected int c;

    /* variable marked as public can be access from
     same class, same package, inherited class, different packages */
    public int d;

    // method should be private, default/package, protected, public
    public void m1(){

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}



class Efg extends Abc{
    @Override
    public void m1(){
        // showing error because it marked as private
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

