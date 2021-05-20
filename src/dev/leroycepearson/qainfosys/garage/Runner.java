package dev.leroycepearson.qainfosys.garage;

import java.util.ArrayList;
import dev.leroycepearson.qainfosys.garage.Vehicle;

class Runner {

    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

        garage.add(new Car("Hyundai", "Sonata", 2002, "Sedan"));
        garage.add(new Spaceship("Starfleet", "Galaxy-class", 2363, "To boldly go where no one has gone before"));
        garage.add(new Bicycle("Radpowerbikes", "Radwagon", 2019, 72.0f));

        for (Vehicle v: garage) {
            System.out.println(v);
        }
    }

}
