package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;
    public ElectricCar() {
        this.engineType = "Electric";
    }
    public String getBName() {
        return this.batteryCapacity;
    }
    public void setBName(int batteryCapacity) {
        return this.batteryCapacity = batteryCapacity;
    }
}
