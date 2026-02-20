package Array;

import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int i =  sc.nextInt();
        String[] name = new String[i];
        for(int j = 0;j<name.length;j++){
            System.out.println("Enter the name for student "+(j+1));
            name[j] = sc.next();
        }
        for(int k = 0;k< name.length;k++){
            System.out.println("Student "+(k+1)+" = "+name[k]);
        }
    }

}
