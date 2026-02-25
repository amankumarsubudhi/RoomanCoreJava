package Inheritance;

class GrandFather extends Dad{
    public void writenovel(){
        System.out.println("Writing novel");
    }
}

class Dad1 extends GrandFather{
    public void sing(){
        System.out.println("Dad is singing");
    }
}

class Child001 extends Dad1{

}

class Child002 extends Dad1{

}

class Child003 extends Dad1{

}


public class Hybrid {

    public static void main(String[] args) {
        Dad1 d = new Dad1();
        d.writenovel();
        d.sing();
        Child001 c = new Child001();
        Child002 c2 = new Child002();
        Child003 c3 = new Child003();
        c.writenovel();
        c.sing();
        c2.writenovel();
        c2.sing();
        c3.writenovel();
        c3.sing();

    }



}
