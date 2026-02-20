package Array;

import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][];
        a[0] = new int[2];
        a[1] = new int[3];

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.println("Enter the value for ["+i+"] ["+j+"]");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output In Matrix Form");
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

}
