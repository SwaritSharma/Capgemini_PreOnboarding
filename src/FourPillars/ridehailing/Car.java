package FourPillars.ridehailing;

public class Car extends Vehicle{
    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.2; // higher comfort charge
    }
}
