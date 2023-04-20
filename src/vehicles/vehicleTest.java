package vehicles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class vehicleTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Audi");
        car.makeNoise();
        Vehicle tractor = new Vehicle();
        tractor.setName("Audi");
        Vehicle motor = new Vehicle();
        motor.setName("paque");
        Vehicle helicopter = new Vehicle();
        helicopter.setName("Apachi");
        ArrayList<Vehicle>  vehicleArrayList =new  ArrayList<>();
        vehicleArrayList.add(tractor);
        vehicleArrayList.add(helicopter);
        vehicleArrayList.add(motor);
        System.out.println(vehicleArrayList.toString());

    }

}
