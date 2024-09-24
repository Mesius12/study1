package vehicles;

public class ElectricCar extends  Car {
    private int batteryCap;
    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber, "Electric");
    }

    public void setBatteryCap(int batteryCap) {
        this.batteryCap = batteryCap;
    }
    public int getBatteryCap() {
        return this.batteryCap;
    }

    public String VehicleType() {
        return "Electric Car";
    }

}

