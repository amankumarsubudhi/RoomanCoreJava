package StaticKeyword;

class MyStatic{
    static int x;
    static int y;
    static {
        System.out.println("Inside Static Block");
        x = 10;
        y = 20;

    }

    public static void staticMethod(){
        System.out.println("Inside Static Method");
        System.out.println("Accessing Static Variables");
        System.out.println(x);
        System.out.println(y);
    }

        int a;
        int b;
        {
            System.out.println("Inside Instance Block");
            a = 100;
            b = 200;
        }

        public void instanceMethod(){
            System.out.println("Inside instance Method");
        }

        public MyStatic(){
            System.out.println("Inside Constructor");
            System.out.println("Accessing Instance Variables");
            System.out.println(a);
            System.out.println(b);
        }

    }

public class MyAlpha {

    public static void main(String[] args) {

        MyStatic.staticMethod();
        MyStatic m = new MyStatic();
        m.instanceMethod();


    }

}
