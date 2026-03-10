package M1_Test;

import java.util.Scanner;

public class LongWord {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(shorten(str));
    }

    private static String shorten(String str) {
        String arr[] = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 10){
                arr[i] = "" + arr[i].charAt(0) + (arr[i].length() - 2) + arr[i].charAt(arr[i].length() - 1);
            }
            ans.append(arr[i]);
            if(i != arr.length - 1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
