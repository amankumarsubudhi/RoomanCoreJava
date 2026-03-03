package FinalKeyword;


/* final class can't be extended */

/* final methods can't be overridden */

class MyFinal{


    public void nonfinal(){
        System.out.println("Inside Non Final");
    }


    final void m1(){
        System.out.println("m1() is a final method can't be overridden");
    }
}


class MyChild extends MyFinal{
    @Override
    public void nonfinal(){
        System.out.println("Overriding nonfinal in child class");
    }

//    Error - java: m1() in FinalKeyword.MyChild cannot override m1() in FinalKeyword.MyFinal
//    overridden method is final

//    @Override
//    public void m1(){
//        System.out.println("m1() is a final method can't be overridden");
//    }

    /*abstract says compulsory override
    public abstract final void m2();
    final says can't be overridden
     */

}



public class MyExecution {


    public static void main(String[] args) {

        MyChild c =  new MyChild();
        c.nonfinal();
        // Since child class has no such method called "m1()" so
        // compiler calling the immediate parent class and give the body of the parent class
        c.m1();

        // final variable value can't be change or reassign
        final double a = 100.01;
        System.out.println(a);

        System.out.println(Math.PI);

    }


}
