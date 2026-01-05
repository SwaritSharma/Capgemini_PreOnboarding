package Level2;

import java.util.Scanner;
class TimeAndDistanceFromAToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String fromCity = scanner.nextLine();
        String viaCity = scanner.nextLine();
        String toCity = scanner.nextLine();
        double distanceFromToVia = scanner.nextDouble();
        double distanceViaToFinalCity = scanner.nextDouble();
        int timeFromToViaHours = scanner.nextInt();
        int timeFromToViaMinutes = scanner.nextInt();
        int timeViaToFinalCityHours = scanner.nextInt();
        int timeViaToFinalCityMinutes = scanner.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTimeMinutes = (timeFromToViaHours + timeViaToFinalCityHours)*60 + (timeFromToViaMinutes + timeViaToFinalCityMinutes);
        System.out.println("The total distance by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " and the total time is " + totalTimeMinutes + " minutes");
        scanner.close();
    }    
}
