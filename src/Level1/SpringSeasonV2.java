package Level1;

public class SpringSeasonV2 {

    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month > 3 && month < 6) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        System.out.println("Entered Month: " + month);
        System.out.println("Entered Day: " + day);

        if (isSpringSeason(month, day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
