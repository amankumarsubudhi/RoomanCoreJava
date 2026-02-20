package Array;

import java.util.Scanner;

public class ThreeDRegularArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][][] a = new int [2][3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println("Enter The Value For a[" + i+ "] [" + j + "] [" + k + "] : ");
                    a[i][j][k] = sc.nextInt();
                }
            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + "\t");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }


    }

}
