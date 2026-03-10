package M1_Test;

import java.util.Scanner;

public class RepeatString {

    static void main() {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String str=sc.next();
        System.out.println(newString(str,N));
    }

    private static String newString(String str, int n) {
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(str);
            n--;
        }
        return sb.toString();
    }
}
