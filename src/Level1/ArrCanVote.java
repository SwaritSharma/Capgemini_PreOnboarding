package Level1;

import java.util.Scanner;

public class ArrCanVote
{
    public static void canVote(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=18)
            {
                System.out.println("The student with the age "+arr[i]+" can vote.");
            }
            else
                System.out.println("The student with the age "+arr[i]+" cannot vote.");
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        while(i<n)
        {
            System.out.print("Enter the age of "+(i+1)+" student :");
            int age=sc.nextInt();
            while(age<=0){
                System.out.println("Invalid Age enter again");
                age=sc.nextInt();
            }
            arr[i]=age;
            i++;
        }
        canVote(arr);
    }
}
