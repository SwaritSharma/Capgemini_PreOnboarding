package Level1;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378; // in kilometers
        double volumeInKilometers = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        double volumeInMiles = volumeInKilometers/Math.pow(1.609344, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometers + " and cubic miles is " + volumeInMiles);
    }
}
