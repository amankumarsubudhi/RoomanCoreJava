package Array;

import java.util.Scanner;

public class TwoDimensionalArray {


    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows");
        i = sc.nextInt();
        System.out.println("Enter The Number Of Columns");
        j = sc.nextInt();
        int[][] arr = new int[i][j];


        for(int k = 0;k<i;k++){
            for(int l = 0;l<j;l++){
                System.out.println("Enter The Number For arr ["+k+"]"+"["+l+"]");
                arr[k][l] = sc.nextInt();
            }
        }

        System.out.println("Output In Matrix Form");
        for(int m = 0;m<i;m++){
            for(int n = 0;n<j;n++){
                System.out.print(arr[m][n]+"         ");
            }
            System.out.println("");
        }

    }

}
