package FourPillars.ridehailing;

public class Bike  extends  Vehicle{
    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // economical
    }
}
