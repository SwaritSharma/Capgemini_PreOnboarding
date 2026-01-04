package Level1;

public class SpringSeason {

    static {
        System.out.println("Enter month first");
        System.out.println("Enter day now");
    }

    public static void main(String[] args) {

        String month = args[0];
        int day = Integer.parseInt(args[1]);

        if (day < 1 || day > 31) {
            System.out.println("Invalid Date");
            return;
        }

        switch (month.toLowerCase()) {

            case "march":
                if (day >= 20)
                    System.out.println("Spring Season");
                else
                    System.out.println("Not Spring Season");
                break;

            case "april":
            case "may":
                System.out.println("Spring Season");
                break;

            case "june":
                if (day <= 20)
                    System.out.println("Spring Season");
                else
                    System.out.println("Not Spring Season");
                break;

            default:
                System.out.println("Not Spring Season");
        }
    }
}
