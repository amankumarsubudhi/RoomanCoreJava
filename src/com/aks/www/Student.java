package com.aks.www;

public class Student {

    String name;
    String regNo;
    String degree;

    public void eat(){
        System.out.println("Student is eating");
    }

    public void study(){
        System.out.println("Student is studying");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.regNo = "2405204007";
        s1.degree = "MCA";

        System.out.println("Name: " + s1.name);
        System.out.println("Registration No: " + s1.regNo);
        System.out.println("Degree: " + s1.degree);

    }

}
