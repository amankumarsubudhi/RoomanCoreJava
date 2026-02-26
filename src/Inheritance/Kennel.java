package Inheritance;

class Dog{
    public void bark(){
        System.out.println("Dog Is Barking...");
    }
}

class Puppy extends Dog{

}


public class Kennel {


    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.bark();
    }


}
