package vehicles;

public class Car extends Vehicle {
    private String model;
    private int year;
    private int license;
    private String ownerName;
    private String color;
    private int insuranceNumber;
    protected String engineType;

    public Car(int license, int year, int insuranceNumber, String color, String model, String engineType, String ownerName) {
        super(license, year, insuranceNumber, color, ownerName, engineType );
    }

    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber, String electric) {
        super();
    }

    public String VehicleType() {
        return "Car";
    }

}
