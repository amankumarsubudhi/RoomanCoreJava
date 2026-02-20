package UserInput;

import java.util.Scanner;

public class MyInput {

    String name; int age; boolean status; double salary;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyInput i = new MyInput();
        /*System.out.println(i.name);
        System.out.println(i.age);
        System.out.println(i.status);
        System.out.println(i.salary);
        i.name = "Aks";
        i.age = 22;
        i.status = false;
        i.salary = 85000;*/

        System.out.println("Enter your name: ");
        i.name = sc.nextLine();
        System.out.println("Enter your age: ");
        i.age = sc.nextInt();
        System.out.println("Enter your salary: ");
        i.salary = sc.nextDouble();
        System.out.println("Enter your status: ");
        i.status = sc.nextBoolean();

        System.out.println("Name: " + i.name);
        System.out.println("Age: " + i.age);
        System.out.println("Salary: " + i.salary);
        System.out.println("Status: " + i.status);
        
    }


}
