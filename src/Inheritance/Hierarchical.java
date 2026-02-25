package Inheritance;

class Dad{
    public void sing(){
        System.out.println("Dad is singing");
    }
}

class Child01 extends Dad{

}

class Child02 extends Dad{

}

class Child03 extends Dad{

}

public class Hierarchical {
    public static void main(String[] args) {
        Child01 child11 = new Child01();
        Child02 child12 = new Child02();
        Child03 child13 = new Child03();
        child11.sing();
        child12.sing();
        child13.sing();
    }
}
