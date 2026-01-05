package Level1;
import java.util.*;
public class FirstIsSmallest
{
    public static boolean check(int n1,int n2,int n3)
    {
        int no=Math.min(n1,Math.min(n2,n3));
        if(no==n1)return true;
        return false;
    }
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of comparisons to be done");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the 1st number");
            int n1=sc.nextInt();
            System.out.println("Enter the 2nd number");
            int n2=sc.nextInt();
            System.out.println("Enter the 3rd number");
            int n3=sc.nextInt();
            System.out.println((check(n1,n2,n3)==true)?"first number is the smallest":"first number is not the smallest");
            t--;
        }
    }
}
