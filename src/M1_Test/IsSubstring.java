package M1_Test;

import java.util.Scanner;

public class IsSubstring {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(containsString(str1,str2)?"Yes":"No");
    }

    private static boolean containsString(String str1, String str2) {
        if(str1.contains(str2)){
            return true;
        }
        return false;
    }
}
