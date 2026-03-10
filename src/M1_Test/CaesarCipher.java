package M1_Test;

import java.util.Scanner;

public class CaesarCipher {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(decode(str,str.length()));
    }

    private static String decode(String str, int length) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<length;i++){
            char ch=str.charAt(i);
            switch (ch){
                case 'x':{
                    res.append('a');
                    continue;
                }
                case 'y':{
                    res.append('b');
                    continue;
                }
                case 'z':{
                    res.append('c');
                    continue;
                }
                default:res.append((char)(ch+3));
            }

        }
        return res.toString();
    }


}
