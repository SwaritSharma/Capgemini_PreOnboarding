package level1;

import java.util.Scanner;
public class SideOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int perimeter = scanner.nextInt();
        int side = perimeter / 4;
        System.out.println("The side of square is " + side + " whose perimeter is " + perimeter);
        scanner.close();
    }
}
