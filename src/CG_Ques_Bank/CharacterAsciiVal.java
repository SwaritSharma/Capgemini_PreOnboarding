package CG_Ques_Bank;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterAsciiVal
{
    public static void ascii(String s)
    {
        HashMap<Character,Integer>table=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int code=(int)ch;
            if(!table.containsKey(ch)){
                table.put(s.charAt(i),code);
                System.out.println("Ascii value of character "+s.charAt(i)+" = "+code);
            }

        }

    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter all the characters ");
            String s1=sc.nextLine();
            ascii(s1);
            t--;
        }
    }
}
