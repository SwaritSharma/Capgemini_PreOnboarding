package CG_Ques_Bank;

import java.util.*;

public class AnagramStrings {
    public static void anagram(String s1,String s2)
    {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)map.remove(c);
            }
        }
        if(map.size()==0)
        {
            System.out.println("Anagram strings "+s1+" and "+s2);
            return;
        }
        System.out.println("Not Anagram strings "+s1+" and "+s2);
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter the first String");
            String s1=sc.nextLine();
            System.out.println("Enter the second String");
            String s2=sc.nextLine();
            anagram(s1,s2);
        }
    }
}
