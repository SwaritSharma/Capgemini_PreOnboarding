package Logical;

import java.util.Scanner;

public class MaxEvenLengthWord {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(maxWord(str,str.length()));
    }

    private static String maxWord(String str, int n) {
        int i=0;
        int maxlen=0;
        String res="";
        while(i<n){
            int j=i;
            while(j<n && str.charAt(j)!=' '){
                j++;
            }
            if((j-i)%2==0 && maxlen<j-i){
                maxlen=j-i;
                res=str.substring(i,j);
            }
            i=j+1;
        }
        return maxlen>0 ? res:"00";
    }
}
