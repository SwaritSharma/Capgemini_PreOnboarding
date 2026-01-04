package Level3;

import java.util.Scanner;

public class LeapYear {
    public static void leapYear(int year)
    {
        if (year < 1582) {
            System.out.println("Leap Year rule is valid only for year >= 1582");
            return;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " Is a Leap Year");
                } else {
                    System.out.println(year + " Is Not a Leap Year");
                }
            } else {
                System.out.println(year + " Is a Leap Year");
            }
        } else {
            System.out.println(year + " Is Not a Leap Year");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("Enter the year");
            int year = sc.nextInt();
            leapYear(year);
            t--;
        }
    }
}
