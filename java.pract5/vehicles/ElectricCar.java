package Vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private double batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.engineType = "Electric"; // Устанавливаем тип двигателя как "Electric"
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double capacity) {
        this.batteryCapacity = capacity;
    }

    public String vehicleType() {
        return "Electric Car"; // Возвращаем тип транспортного средства
    }
}
