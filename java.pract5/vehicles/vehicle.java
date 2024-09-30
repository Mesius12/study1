package Vehicles;

public abstract class vehicle {
    private String model;
    private int license;
    private String color;
    private int year;
    private String OwnerName;
    private int insuranceNumber;
    protected String engineType;

    public vehicle(String model, int license, String color, int year, String OwnerName, int insuranceNumber, String engineType) {
    } // base constructor
    public vehicle() {
    } // default constructor

    public String toString(){
        return "{"+model+" "+license+" "+color+" "+year+" "+OwnerName+" "+insuranceNumber+" "+engineType+"}";
    }

    public abstract String VehicleType(); // abstract method

    // setters
    public void setLicense(int license) {
        this.license = license;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }
    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //getters

    public int getLicense() {
        return this.license;
    }
    public int getYear() {
        return this.license;
    }
    public int getInsuranceNumber() {
        return this.insuranceNumber;
    }
    public String getModel() {
        return this.model;
    }
    public String getOwnerName() {
        return this.OwnerName;
    }
    public String getEngineType() {
        return this.engineType;
    }
    public String getColor() {
        return this.color;
    }
}
