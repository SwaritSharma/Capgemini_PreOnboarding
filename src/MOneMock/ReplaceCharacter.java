package MOneMock;

import java.util.Scanner;

public class ReplaceCharacter {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        System.out.println(replace(str,ch1,ch2));
    }

    private static String replace(String str, char ch1, char ch2) {
        if(str==null){
            return null;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1){
                res.append(ch2);
            } else if (str.charAt(i)==ch2) {
                res.append(ch1);
            }
            else
                res.append(str.charAt(i));
        }
        return res.toString();
    }
}
