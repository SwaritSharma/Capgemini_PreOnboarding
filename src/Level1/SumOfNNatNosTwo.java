package Level1;
import java.util.*;

public class SumOfNNatNosTwo {
    public static int formulaeSum(int n)
    {
        return (n*(n+1)/2);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of test cases");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            int n1=n;
            int sum=0;
            while(n>0)
            {
                sum+=n;
                n--;
            }
            if(sum==formulaeSum(n1))
                System.out.println("Compared sum "+sum);
            t--;
        }
    }
}
