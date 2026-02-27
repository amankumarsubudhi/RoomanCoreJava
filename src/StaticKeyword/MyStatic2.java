package StaticKeyword;


public class MyStatic2 {
    static int a=1000;

    static {
        System.out.println(a);
        System.out.println("Static Method Initialized");
        a=100;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Hello Main Method");
    }

}
