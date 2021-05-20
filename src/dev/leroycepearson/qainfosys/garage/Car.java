package dev.leroycepearson.qainfosys.garage;

public class Car extends Vehicle {

    String formFactor;

    public Car(String make, String model, int year, String formFactor) {
        super(make, model, year);
        this.formFactor = formFactor;
    }

    @Override()
    public float getBill() {
        float yearsold = (float) 2021 - this.year;
        return 20000 * 50 / (yearsold * yearsold);
    }

}
