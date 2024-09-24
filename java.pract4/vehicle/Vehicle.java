package vehicles;

public abstract class Vehicle {
    private String model;
    private int year;
    private int license;
    private String ownerName;
    private String color;
    private int insuranceNumber;
    protected String engineType;

    public Vehicle(int license, int year, int insuranceNumber, String color, String ownerName, String engineType) {
    }

    public Vehicle() {

    }

    // setter

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLicense(int license) {
        this.license = license;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    // getters

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }
    public String getEngineType() {
        return this.engineType;
    }
    public int getInsuranceNumber() {
        return this.insuranceNumber;
    }
    public int getYear() {
        return this.year;
    }
    public int getLicense() {
        return this.license;
    }
    public String getOwnerName() {
        return this.ownerName;
    }
    public abstract String VehicleType();
}
