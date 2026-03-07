package GfgSheet;

import java.util.Scanner;

public class StringTransformation {
    static void transform(String str){
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                sb.append('b');
            }
            else if(str.charAt(i)=='b'){
                sb.append('a');
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        transform(str);
    }
}
