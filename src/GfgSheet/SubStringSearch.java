package GfgSheet;

import java.util.Scanner;

public class SubStringSearch {
    static void search(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()<str2.length()){
            System.out.println(-1);
            return;
        }
        int i=0;
        while(i<str1.length()){
            int j=i;
            while(j<str1.length() && str1.charAt(j)!=' '){
                j++;
            }
            if(str2.equals(str1.substring(i,j))){
                System.out.println(i);
                return;
            }
            i=j+1;
        }
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.next();
        search(str1,str2);
    }
}
