package M1_Test;

import java.util.Scanner;

public class ConvertTo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(convertTo(str,str.length())?"Upper Case":"Lower Case");
    }

    private static boolean convertTo(String str, int length) {
        int uc=0,lc=0;
        for(int i=0;i<length;i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                lc++;
            }
            else if(ch>='A' && ch<='Z'){
                uc++;
            }
        }
        return uc>lc?true:false;
    }
}
