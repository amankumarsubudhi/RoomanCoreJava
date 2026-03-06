package Inheritance;

// Child class overridden method should maintain the same return type as the parent method

// As per the primitive datatype is considered

//If A Overridden Method Return A Child Object Of That Parent Class Is Called Covariance.


/*                        |
                          |   (Scope Increases Downwards)
                          v
                       PRIVATE
                     P A C K A G E
                   P R O T E C T E D
                 P   U   B   L   I   C
                          ^
                          | (Scope Decreases Upwards)
                          |
*/


class MyParent01{
 /*   public int add(){
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a+b));
        return a+b;
    }*/

    public Animal add(){
        Animal a = new Animal();
        return a;
    }
}

class MyChild01 extends MyParent01{
    @Override
    public Lion add(){
        Lion l = new Lion();
        return l;
    }
   /* @Override
    *//*public Lion add(){
        Lion l = new Lion();
        return l;
    }*/
}

class Animal{

}

class Lion extends Animal{

}

class Tiger{

}

public class MyRules {

    public static void main(String[] args) {
    MyChild01 m = new MyChild01();
    m.add();
    }

}
