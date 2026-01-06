package Level1;

import java.util.Scanner;

public class ArrMultiplication
{
    public static void multi(int n,int arr[])
    {
        int i=0;
        while(i<10){
            arr[i]=(i+1)*n;
            i++;
        }
        for(int j=0;j<10;j++)
        {
            System.out.println(n+" * "+(j+1)+" = "+arr[j]);
        }
    }
    static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int arr[]=new int[10];
        multi(n,arr);
    }
}
