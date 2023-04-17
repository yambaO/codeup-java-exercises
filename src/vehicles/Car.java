package vehicles;

import vehicles.Vehicle;

public class Car extends Vehicle {
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Braha Braha");
    }
}