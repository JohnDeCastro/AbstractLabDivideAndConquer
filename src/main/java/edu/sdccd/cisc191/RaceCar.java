package edu.sdccd.cisc191;

public class RaceCar extends Car {

    int horsePower;
    int torque;

    public RaceCar(String make, String model, int horsePower, int torque){
        super(make, model);
        this.horsePower = horsePower;
        this.torque = torque;
    }
}
