package Logical;

import java.util.Scanner;

public class CountValidWords {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(validWords(str));
    }

    private static int validWords(String str) {

        String[] words = str.split(" ");
        int count = 0;
        for(String word : words){
            boolean valid = true;
            int hyphen = 0;
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                if(Character.isDigit(ch) || Character.isUpperCase(ch)){
                    valid = false;
                    break;
                }
                if(ch == '-'){
                    hyphen++;

                    if(hyphen > 1 || i == 0 || i == word.length()-1 ||
                            !Character.isLetter(word.charAt(i-1)) ||
                            !Character.isLetter(word.charAt(i+1))){
                        valid = false;
                        break;
                    }
                }
                if(ch=='!' || ch==',' || ch=='.'){
                    if(i != word.length()-1){
                        valid = false;
                        break;
                    }
                }
                if(!Character.isLetter(ch) && ch!='-' && ch!='!' && ch!=',' && ch!='.'){
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return count;
    }
}
