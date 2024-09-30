package Vehicles;

public class Car extends  vehicle{

    public Car(String model,int license,String color,int year,String OwnerName, int insuranceNumber, String engineType){
        super(model,license,color,year,OwnerName,insuranceNumber,engineType);
        this.setEngineType("Combustion");

    }

    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber) {
    }


    public String VehicleType() {
        return "Car";
    }
}
