package Level1;

import java.util.Scanner;
public class RocketLaunchTwo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Launch!");
        sc.close();
    }
}

