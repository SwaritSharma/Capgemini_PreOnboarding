package MOneMock;

import java.util.HashSet;
import java.util.Scanner;

public class AutoBiographicalNo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(autoBiographical(str,str.length()));
    }

    private static int autoBiographical(String str, int n) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(countOcc(str,i)!=Integer.parseInt(str.charAt(i)+"")){
                return 0;
            }
            set.add(str.charAt(i));
        }
        return set.size();
    }

    private static int countOcc(String str, int c) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c+'0'){
                count++;
            }
        }
        return count;
    }

}
