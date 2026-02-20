package Array;

import java.util.Scanner;

public class StoreArray {
    public static void main(String[] args) {
        int[] mark = new int [5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<=4; i++){
            System.out.println("Enter Data For mark["+i+"]");
            mark[i] = sc.nextInt();
        }

        for(int j = 0; j<=4;j++){
            System.out.println("Data in a["+j+"] = "+mark[j]);
        }
    }
}
