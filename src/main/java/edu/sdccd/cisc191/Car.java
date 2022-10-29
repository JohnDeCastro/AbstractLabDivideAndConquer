package edu.sdccd.cisc191;

public class Car extends Vehicle {
    String fuel = "gas";
    int wheels = 4;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public void turnOn(){
        System.out.println("Vroom Vroom!");
    }

    public void honk(){
        System.out.println("Beep beep!");
    }

}
