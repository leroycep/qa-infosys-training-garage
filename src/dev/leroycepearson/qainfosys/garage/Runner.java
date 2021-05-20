package dev.leroycepearson.qainfosys.garage;

import java.util.ArrayList;
import dev.leroycepearson.qainfosys.garage.Vehicle;

class Runner {

    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.add(new Car("Hyundai", "Sonata", 2002, "Sedan"));
        garage.add(new Spaceship("Starfleet", "Galaxy-class", 2363, "To boldly go where no one has gone before"));
        garage.add(new Bicycle("Rad", "Radwagon", 2019, 72.0f));

        garage.add(new Car("Big", "Car", 2017, "Sedan"));
        garage.add(new Car("Big", "Truck", 2018, "Pickup"));
        garage.add(new Car("Big", "Hatchback", 2019, "Hatchback"));

        garage.printAll();

        garage.removeByModel("Truck");

        garage.printAll();

        System.out.println("\n\n------\n\n");

        garage.printBills();

        System.out.println("\n\n------\n\n");

        garage.emptyGarage();
        garage.printAll();
    }

}
