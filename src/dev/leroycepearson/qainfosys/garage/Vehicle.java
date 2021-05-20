package dev.leroycepearson.qainfosys.garage;

public abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.make + " " + this.model + " " + this.year;
    }

}
