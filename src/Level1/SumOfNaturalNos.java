package Level1;
import java.util.*;
public class SumOfNaturalNos
{
    public static int sum(int n)
    {
        if(n<0)return -1;
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of checks");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            int x=sum(n);
            System.out.println(x==-1?"Negative Number is not Natural":"Sum is "+x);
            t--;
        }
    }
}
