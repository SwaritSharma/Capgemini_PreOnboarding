package Mock_M1;

import java.util.Scanner;

public class RemoveMirrorCharacters {

    public static void remove(String str){
        if(str.length()%2!=0){
            System.out.println("Not possible");
            return;
        }
        int mid=str.length()/2;
        if(str.substring(0,mid).equals(str.substring(mid,str.length()))) {
            System.out.println(str.substring(0, mid));
            return;
        }
        System.out.println(str+" not possible");
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        remove(str);
    }
}
