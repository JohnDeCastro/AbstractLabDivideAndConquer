package edu.sdccd.cisc191;

public class AbstractLab {

    public static void main(String[] args){

        RaceCar supra = new RaceCar("Toyota", "Supra", 1000, 1000);

        System.out.println("This is a " + supra.make + " " + supra.model +
                ". It has " + supra.wheels + " wheels, takes " + supra.fuel + " as fuel, makes "
                + supra.horsePower + " HP and " + supra.torque + " LB/FT of torque!");

        supra.turnOn();
        supra.honk();
    }

}

