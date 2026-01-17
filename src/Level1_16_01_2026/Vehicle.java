package Level1_16_01_2026;

public class Vehicle {
    private String ownerName;
    private String vehicleType;

    static int registrationFee=499;

    Vehicle(String ownerName,String vehicleType)
    {
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    Vehicle(Vehicle vehicle)
    {
        this.ownerName=vehicle.ownerName;
        this.vehicleType=vehicle.vehicleType;
    }

    public void displayVehicleDetails()
    {
        System.out.println("Owner Name "+ownerName);
        System.out.println("Vehicle Type "+vehicleType);
    }
    public static void updateRegistrationFee(int fee){
        registrationFee=fee;
    }
}
