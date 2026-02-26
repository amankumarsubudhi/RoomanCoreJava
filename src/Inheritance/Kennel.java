package Inheritance;

class Dog{

    String name;
    int cost;
    String breed = "German Shepard";

    public Dog(String name) {
        this.name = name;
        System.out.println("Inside Name constructor");
    }

    public Dog(int cost) {
        this("Ruby");
        System.out.println("Inside Cost constructor");
        this.cost = cost;
    }

    public Dog() {
        this(12000);
        System.out.println("Dog object created");
    }


    public void bark(){
        System.out.println("Dog Barks Loudly");
    }
}

class Puppy extends Dog{

    public Puppy() {
        super();
        System.out.println("Puppy object created");
    }

    @Override
    public void bark() {
        System.out.println("Puppy Barks Very Low Voice");
    }
}


public class Kennel {


    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.bark();
        System.out.println(p.breed);
    }


}
