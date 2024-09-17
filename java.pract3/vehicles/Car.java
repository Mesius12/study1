import java.util.Scanner;

package vehicles;

public class Car {
    private String insuranceNumber;
    private String ownerName;
    protected String engineType;

    public void setOName(String ownerName) {
        return this.ownerName = ownerName;
    }
    public String getOName() {
        return this.ownerName;
    }
    public void setIName(String insuranceNumber) {
        return this.insuranceNumber = insuranceNumber;
    }
    public String getIName() {
        return this.insuranceNumber;
    }
    public String getEName() {
        return this.engineType;
    }
    public void setEName(String engineType) {
        return this.engineType = engineType;
    }   

}
