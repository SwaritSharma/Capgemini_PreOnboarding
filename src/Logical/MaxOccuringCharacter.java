package Logical;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MaxOccuringCharacter {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(maxOccuringChar(str,str.length()));
    }

    private static char maxOccuringChar(String str, int length) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        int maxFreq=0;
        for(int i=0;i<length;i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            if(map.get(str.charAt(i))>maxFreq){
                maxFreq=map.get(str.charAt(i));
            }
        }

        for(char c:map.keySet()){
            if(map.get(c)==maxFreq){
                return c;
            }
        }
        return ' ';
    }
}
