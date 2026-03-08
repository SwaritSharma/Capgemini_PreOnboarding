package MOneMock;

import java.util.Scanner;

public class MoveHyphens {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(moveFront(str));
    }

    private static String moveFront(String str) {
        if(str == null) return null;

        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='-')
                sb.append(str.charAt(i));
        }
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!='-')
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
