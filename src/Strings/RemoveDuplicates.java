package Strings;
import java.util.Scanner;

class RemoveDuplicates {

    static String removeDup(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (res.indexOf(s.charAt(i)) == -1)
                res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.println("After Removing Duplicates: " + removeDup(s));
    }
}
