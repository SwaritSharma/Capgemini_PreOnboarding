package Level1;
import java.util.*;
public class DivisibleByFive
{
    public static boolean check(long no)
    {
        no=Math.abs(no);
        if(no % 5==0)
            return true;
        return false;
    }
    public static void main() {
        Scanner sc=new Scanner(System.in);
        //
        System.out.println("Enter how many numbers are to be checked");
        long t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the number");
            int no=sc.nextInt();
            System.out.println(check(no)==true?"divisible":"Not divisible");
            t--;
        }
    }
}
