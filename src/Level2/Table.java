package Level2;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of calculations to be done");
        int t=sc.nextInt();
        while(t>0) {
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
            t--;
        }
        sc.close();
    }
}

