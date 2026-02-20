package Array;

import java.util.Scanner;

public class DoubleArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees");
        int i =  sc.nextInt();
        Double[] salary = new Double[i];
        for(int j = 0;j<salary.length;j++){
            System.out.println("Enter the salary for employee "+(j+1));
            salary[j] = sc.nextDouble();
        }
        for(int k = 0;k< salary.length;k++){
            System.out.println("Employee "+(k+1)+"'s salary = "+salary[k]);
        }
    }


}
