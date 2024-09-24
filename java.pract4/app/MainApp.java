package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class MainApp {
    public static void main(String[] args) {
        Vehicle TestCar = new Car("Jiguli", "123228", "Red", 2020,
                "Ivanov Artem", "INS14525123456", "Gas");
        Vehicle TestECar = new ElectricCar("Zeekr","51351512","Red", 2024,
                "Artem Ivanovich", "4152515");

        TestCar.setColor("Black");
        TestECar.setOwnerName("Ivan Artemovich");

        System.out.println(TestCar.VehicleType() + '\n' + TestCar.getModel() + '\n' +
                TestCar.getEngineType() + '\n' + TestCar.getLicense() + '\n' +
                TestCar.getOwnerName() + '\n' + TestCar.getYear() + '\n' + TestCar.getColor() + '\n');
        System.out.println(TestECar.VehicleType() + '\n' + TestECar.getModel() + '\n' +
                TestECar.getEngineType() + '\n' + TestECar.getLicense() + '\n' +
                TestECar.getOwnerName() + '\n' + TestECar.getYear() + '\n' + TestECar.getColor() + '\n');


    }
}
