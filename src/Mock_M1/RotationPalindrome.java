package Mock_M1;

import java.util.Scanner;

public class RotationPalindrome {
    public static boolean palindrome(char[] arr) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            if (arr[st] != arr[end]) return false;
            st++;
            end--;
        }
        return true;
    }

    public static void rotate(String str) {
        char[] arr = str.toCharArray();
        int r = arr.length;

        if (palindrome(arr)) {
            System.out.println("true : " + str);
            return;
        }

        for (int i = 0; i < r; i++) {
            char temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;

            if (palindrome(arr)) {
                System.out.println("true : " + new String(arr));
                return;
            }
        }
        System.out.println(str + " false");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        rotate(str);
    }
}
