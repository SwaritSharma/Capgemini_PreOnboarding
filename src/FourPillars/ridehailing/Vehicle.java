package FourPillars.ridehailing;

public abstract class Vehicle implements GPS{
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    private String currentLocation;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public abstract double calculateFare(double distance);
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId +
                ", Driver: " + driverName +
                ", Rate per Km: ₹" + ratePerKm;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
