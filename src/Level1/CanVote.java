package Level1;
import java.util.*;
public class CanVote
{
    public static void check(int age)
    {
        if(age<0) System.out.println("Enter a vaild age");
        System.out.println(age>=18?"Eligible to vote "+age:"Minor cannot vote "+age);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of checks to be done");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the age");
            int age=sc.nextInt();
            check(age);
            t--;
        }

    }
}
