package dev.leroycepearson.qainfosys.garage;

public class Spaceship extends Vehicle {

    String mission;

    public Spaceship(String make, String model, int year, String mission) {
        super(make, model, year);
        this.mission = mission;
    }

}
