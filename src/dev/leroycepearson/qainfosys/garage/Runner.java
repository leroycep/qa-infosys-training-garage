package dev.leroycepearson.qainfosys.garage;

import java.util.ArrayList;
import dev.leroycepearson.qainfosys.garage.Vehicle;
import dev.leroycepearson.qainfosys.garage.Car;

class Runner {

    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

        garage.add(new Car("Hyundai", "Sonatat", 2002));

        for (Vehicle v: garage) {
            System.out.println(v);
        }
    }

}
