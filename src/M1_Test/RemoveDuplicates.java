package M1_Test;

import java.util.Scanner;

public class RemoveDuplicates {

    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(remove(str));
    }

    private static String remove(String str) {
        int freq[]=new int[256];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch]==0){
                freq[str.charAt(i)]++;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
