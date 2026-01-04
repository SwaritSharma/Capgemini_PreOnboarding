package Level1;
import java.util.*;
public class TypeOfNumber {
    public static void check(int n){
        if(n>0) System.out.println("Positive Number "+n);
        else if(n<0) System.out.println("Negative Number "+n);
        else if(n==0) System.out.println("Number is "+n);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases to be checked");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            check(n);
            t--;
        }

    }
}
