package Inheritance;

class Dog{
    public Dog() {
        super();
        System.out.println("Dog object created");
    }

    public void bark(){
        System.out.println("Dog Is Barking...");
    }
}

class Puppy extends Dog{

    public Puppy() {
        super();
        System.out.println("Puppy object created");
    }
}


public class Kennel {


    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.bark();
    }


}
