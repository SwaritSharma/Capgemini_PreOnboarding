package Exception;


public class MainApp {

    public static void main(String[] args) {

        // Problem 2
        try {
            System.out.println(DivisionService.calculate(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Problem 3
        UserService userService = new UserService();
        try {
            userService.registerUser("Friday");
            userService.registerUser("Friday");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Problem 6
        DataProcessor dp = new DataProcessor();
        try {
            dp.processData("Hi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Problem 7
        new ConnectionManager().useConnection();
    }
}
