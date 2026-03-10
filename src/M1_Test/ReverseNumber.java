package M1_Test;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }

    private static int reverse(int n) {
        int rev=0;
        while(n!=0){
            rev+=n % 10;
            n=n/10;
            rev*=n!=0 ? 10:1;
        }
        return rev;
    }
}
