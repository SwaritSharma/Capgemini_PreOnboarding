package M1_Test;

import java.util.Scanner;

public class MaxOccuringCharacter {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(count(str,str.length()));
    }

    private static char count(String str, int length) {

        int freq[]=new int[256];
        int max=0;
        char ch='0';
        for(int i=0;i<length;i++){
            freq[str.charAt(i)]++;
            if(freq[str.charAt(i)]>max){
                max=freq[str.charAt(i)];
                ch=str.charAt(i);
            }
        }

        int j=0;
        for(int i:freq){
            if(i==max && (char)j!=ch){
                return '0';
            }
            j++;
        }
        return ch;
    }
}
