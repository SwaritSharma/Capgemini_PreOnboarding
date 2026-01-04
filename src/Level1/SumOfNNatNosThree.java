package Level1;
import java.util.*;

public class SumOfNNatNosThree {
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
            int sum=0;
            for(int n1=n;n1>0;n1--)
                sum+=n1;
            if(sum==formulaeSum(n))
                System.out.println("Compared sum "+sum);
            t--;
        }
    }
}
