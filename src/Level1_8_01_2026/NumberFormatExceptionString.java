package Level1_8_01_2026;

public class NumberFormatExceptionString {
    public static void main(String[] args) {
        handleException();
        //gernerateException();
    }
    public static void gernerateException(){
        String name = "khushi";
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
    public static void handleException(){
        String name = "khushi";
       try{
           int num = Integer.parseInt(name);
       }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException");
            System.out.println(e.getMessage());
        }
       catch (RuntimeException e) {
           System.out.println("RuntimeException caught");
       }
    }
}

//Problem 7

//Write a program to demonstrate NumberFormatException
//Hint =>
//Define a variable to take user input as a String
//Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
//Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program.
//Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
//From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

