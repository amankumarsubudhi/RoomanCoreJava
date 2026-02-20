package Patterns;

public class Pattern3 {


    public static void main(String[] args) {
        int i;
        int j;
        int k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            for (k = 1; k <= 5; k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

}
