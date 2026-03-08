package MOneMock;

import java.util.ArrayList;
import java.util.Scanner;

public class IntermediatePalindrome {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int ll=sc.nextInt(),ul=sc.nextInt();
        ArrayList<Integer> al=palindrome(ll,ul);
        for(int i:al){
            if(i==al.get(al.size()-1)){
                System.out.print(i);
            }else
                System.out.print(i+", ");
        }
    }

    private static ArrayList<Integer> palindrome(int ll, int ul) {
        ArrayList<Integer> res=new ArrayList<>();
        while(ll<ul){
            if(reverse(ll)==ll){
                res.add(ll);
            }
            ll++;
        }
        return res;
    }

    private static int reverse(int n) {
        int rev=0;
        while(n!=0){
            rev+=n % 10;
            n=n/10;
            rev*=n!=0 ? 10:1;
        }
        return rev;
    }
}
