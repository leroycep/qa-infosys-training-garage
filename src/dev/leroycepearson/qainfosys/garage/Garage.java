package dev.leroycepearson.qainfosys.garage;

import java.util.ArrayList;
import dev.leroycepearson.qainfosys.garage.Vehicle;

class Garage {

    ArrayList<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<Vehicle>();
    }

    public void add(Vehicle v) {
        this.vehicles.add(v);
    }

    public void removeByModel(String model) {
        this.vehicles.removeIf(v -> v.model.equals(model));
    }

    public void printAll() {
        for (Vehicle v: this.vehicles) {
            System.out.println(v);
        }
    }

    public void printBills() {
        for (Vehicle v: this.vehicles) {
            System.out.println(v + ": " + v.getBill());
        }
    }

    public void emptyGarage() {
        this.vehicles.clear();
    }

}
