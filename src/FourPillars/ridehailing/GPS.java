package FourPillars.ridehailing;

public interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
