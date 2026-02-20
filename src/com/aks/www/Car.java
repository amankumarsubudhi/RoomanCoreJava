package com.aks.www;

public class Car {

    String carname;
    String brand;
    double cost;
    double mileage;

    public void ignite(){

        System.out.println("Car gets ignited");

    }

    public void accelerate(){

        System.out.println("Car gets accelerated");

    }

    public void applybreak(){

        System.out.println("Breaks Applied");

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.carname = "X6";
        car.brand = "BMW";
        car.cost = 6000000;
        car.mileage = 8;
        System.out.println("Name: " + car.carname);
        System.out.println("Brand: " + car.brand);
        System.out.println("Cost: " + car.cost);
        System.out.println("Mileage: " + car.mileage);
    }

}
