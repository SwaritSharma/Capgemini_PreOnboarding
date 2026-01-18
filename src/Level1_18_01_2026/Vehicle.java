package Level1_18_01_2026;
class Vehicle {
    static double registrationFee = 500.0;
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            System.out.println("Owner Name: " + vehicle.ownerName);
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Registration Number: " + vehicle.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Object is not a Vehicle instance.");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car", "ABC-123");
        v1.displayVehicleDetails(v1);

        Vehicle.updateRegistrationFee(600.0);
        System.out.println("After updating registration fee:");
        v1.displayVehicleDetails(v1);
    }
}
