package Level2;

import java.util.Scanner;

public class CelciusToFarhenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celcius = scanner.nextDouble();
        double farhenheitResult  = (celcius * 9/5) + 32;
        System.out.println("The " + celcius + " celcius is " + farhenheitResult + " farhenheit");   
        scanner.close();
    }
}
