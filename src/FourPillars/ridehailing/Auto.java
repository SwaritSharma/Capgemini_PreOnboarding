package FourPillars.ridehailing;

public class Auto extends Vehicle{
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.1; // moderate pricing
    }
}
