package Array;

import java.util.Scanner;

public class InputSizeArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int i =  sc.nextInt();
        int[] a = new int[i];
        for(int j = 0;j<a.length;j++){
            System.out.println("Enter Data For mark["+j+"]");
            a[j] = sc.nextInt();
        }
        for(int k = 0;k<a.length;k++){
            System.out.println("Data in a["+k+"] = "+a[k]);
        }
    }

}
