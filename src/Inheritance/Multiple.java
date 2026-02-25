package Inheritance;

class Dad12 extends Object{
    public void writes(){
        System.out.println("Dad Writes In Right Hand");
    }
}

class Mom12 extends Object{
    public void writes(){
        System.out.println("Mom Writes In Left Hand");
    }
}

class Child12 extends Object{

}

public class Multiple {
    public static void main(String[] args) {
        Child12 obj = new Child12();

    }
}
