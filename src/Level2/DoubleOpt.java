package Level2;

import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double multiplyFirst = a*b+c;
        double addFirst = a+b-c;
        double divideFirst = a/b+c;
        double modFirst = a%b+c;
        System.out.println("For a*b+c Value will be " + multiplyFirst + " and for a+b-c Value will be " + addFirst + " and for a/b+c Value will be " + divideFirst + " and for a%b+c Value will be " + modFirst);
        scanner.close();
    }    
}
