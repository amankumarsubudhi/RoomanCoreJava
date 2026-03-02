package MyAbstraction;

abstract class MyAbstract{
    static int a = 10;
    static {
        System.out.println("Inside Static Block");
    }
    public static void m1(){
        System.out.println("Inside Static Method");
    }
    int x = 100;
    {
        System.out.println("Inside Instance Block");
    }
    public MyAbstract(){
        System.out.println("Inside Constructor");
    }
    public void m2(){
        System.out.println("Inside Instance Method");
    }
    public abstract void m3();

}

public class MyNewClass {


    public static void main(String[] args) {
        System.out.println("Checked Successfully");
    }


}
