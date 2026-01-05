package Level1;
import java.util.*;
public class LargestOfThree
{
    public static int check(int n1,int n2,int n3)
    {
        return Math.max(n1,Math.max(n2,n3));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of comparisons to be done");
        int t=sc.nextInt();

        while(t>0)
        {
            System.out.println("Enter the 1st number");
            int n1=sc.nextInt();
            System.out.println("Enter the 2nd number");
            int n2=sc.nextInt();
            System.out.println("Enter the 3rd number");
            int n3=sc.nextInt();
            System.out.println("Largest Number "+check(n1,n2,n3));
            t--;
        }
    }
}
