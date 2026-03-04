package MyInterface;

interface MyInterf{

    public static final int A = 25;


}

class Alpha{
    public void m1(){
        System.out.println("m1");
    }
}
public class Ex1 extends Alpha implements MyInterf{

    public static void main(String[] args) {
        System.out.println(MyInterf.A);
        //A = 50;
    }

}
