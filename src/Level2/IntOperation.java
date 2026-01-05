package Level2;

import java.util.Scanner;
class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int multiplyFirst = a*b+c;
        int addFirst = a+b-c;
        int divideFirst = a/b+c;
        int modFirst = a%b+c;
        System.out.println("For a*b+c Value will be " + multiplyFirst + " and for a+b-c Value will be " + addFirst + " and for a/b+c Value will be " + divideFirst + " and for a%b+c Value will be " + modFirst);
        scanner.close();
    }    
}