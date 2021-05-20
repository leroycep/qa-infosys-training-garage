package dev.leroycepearson.qainfosys.garage;

public class Bicycle extends Vehicle {

    float massKilograms;

    public Bicycle(String make, String model, int year, float massKilograms) {
        super(make, model, year);
        this.massKilograms = massKilograms;
    }

}
