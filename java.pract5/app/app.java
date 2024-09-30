package app;

import Vehicles.Car;
import Vehicles.ElectricCar;

public class app {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", "ABC123", "Black", 2020, "John Doe", "INS123456");
        System.out.println(myCar.toString());
        System.out.println("Тип транспортного средства: " + myCar.VehicleType());

        ElectricCar myElectricCar = new ElectricCar("Tesla Model 3", "XYZ789", "White", 2021, "Jane Smith",
                "INS654321");
        myElectricCar.setBatteryCapacity(75.0); // Устанавливаем емкость батареи
        System.out.println(myElectricCar.toString());
        System.out.println("Тип транспортного средства: " + myElectricCar.vehicleType());
        System.out.println("Емкость батареи: " + myElectricCar.getBatteryCapacity() + " kWh");
    }
}
