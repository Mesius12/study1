package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class MainApp {
    public static void main(String[] args) {
        Car TestCar = new Car();
        TestCar.setOName("Ivan Artemovich");
        TestCar.setIName("004412512352");
        
        System.out.println("Owner of the car: " + TestCar.getOName());
        System.out.println("The insurance number is: " + TestCar.getIName());
        
        // System.out.println("The engine type is: " + TestCar.engineType) поле защищенное, не можем обратиться
        ElectricCar TestECar = new ElectricCar();
        TestECar.setOName("Artem Ivanovich");
        TestECar.setIName("45251512561");
        TestECar.setBName(100500);
        
        System.out.println("The owner of the electric car is: " + TestECar.getOName);
        System.out.println("The insurance number is: " + TestECar.getIName);
        System.out.println("The battery capacity is: " + TestECar.setBName);
    }
}
