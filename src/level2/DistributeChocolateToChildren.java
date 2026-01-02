package level2;

import java.util.Scanner;

class DistributeChocolateToChildren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chocolates = scanner.nextInt();
        int children = scanner.nextInt();
        System.out.println("The number of chocolates each child gets is " + chocolates/children + " and the number of remaining chocolates are " + chocolates%children);
        scanner.close();
    }    
}
