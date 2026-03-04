package MyInterface;

interface Bird{
    public void fly();
    public void eat();
}

abstract class Eagle implements Bird{
    public void fly(){
        System.out.println("Eagle flies in greater heights");
    }
    public abstract void eat();
}

class GoldenEagle extends Eagle{
    public void eat(){
        System.out.println("Golden Eagle eating");
    }
}

class SerpartEagle extends Eagle{
    public void eat(){
        System.out.println("Serpart Eagle eating");
    }
}



public class MyEagleImpln {


    public static void main(String[] args) {

        Bird b1 = new GoldenEagle();
        Bird b2 = new SerpartEagle();
        b1.fly();
        b1.eat();
        b2.fly();
        b2.eat();


    }



}
