package Logical;

import java.util.ArrayList;
import java.util.Scanner;

public class SpamChecker {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int noOfSub=sc.nextInt();
        ArrayList<String> subject=new ArrayList<>();
        ArrayList<String> spamWords=new ArrayList<>();
        int noOfSpam=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<noOfSub;i++){
            subject.add(sc.nextLine());
        }
        for(int i=0;i<noOfSpam;i++){
            spamWords.add(sc.next());
        }
        ArrayList<String>res=check(subject,spamWords,noOfSpam,noOfSub);
        for(int i = 0; i < res.size(); i++){
            if(i == res.size()-1)
                System.out.print(res.get(i));
            else
                System.out.print(res.get(i) + ", ");
        }
    }

    private static ArrayList<String> check(ArrayList<String> subject, ArrayList<String> spamWords, int noOfSpam, int noOfSub) {

        ArrayList<String>check=new ArrayList<>();
        for(String s:subject){
            int i=0;
            int count=0;
            while(i<s.length()){
                int j=i;
                while(j<s.length() && s.charAt(j)!=' '){
                    j++;
                }
                String word=s.substring(i,j);
                for(String w:spamWords){
                    if(w.equalsIgnoreCase(word)){
                        count++;
                    }
                }
                i=j+1;
            }
            if(count >= 2){
                check.add("spam");
            }else{
                check.add("not spam");
            }
        }
        return check;
    }
}
