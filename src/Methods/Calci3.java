package Methods;

public class Calci3 {

    public int add(int x, int y) {
        int sum = x + y;

        return sum;
    }

    public static void main(String[] args) {
        Calci3 c = new Calci3();
        int res = c.add(60, 50);
        System.out.println("Sum = " + res);
    }

}
