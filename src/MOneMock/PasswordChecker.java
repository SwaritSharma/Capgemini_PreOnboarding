package MOneMock;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));
    }

    private static int check(String str) {
        int n = str.length();

        if(n<4){
            return 0;
        }

        if(Character.isDigit(str.charAt(0))){
            return 0;
        }

        boolean hasDigit=false;
        boolean hasCapitalLetter=false;
        for(char c:str.toCharArray()){

            if(c==' ' || c=='/'){
                return 0;
            }

            if(Character.isDigit(c)){
                hasDigit=true;
            }

            else if(Character.isUpperCase(c)){
                hasCapitalLetter=true;
            }
        }
        return (hasDigit && hasCapitalLetter) ? 1:0;
    }
}