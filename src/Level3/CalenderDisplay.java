package Level3;

import java.util.Scanner;

public class CalenderDisplay {

    static boolean isLeapYear(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }

    static String getMonthName(int m) {
        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };
        return months[m - 1];
    }

    static int getDaysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m - 1];
    }

    static int getFirstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int days = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }
    }
}

