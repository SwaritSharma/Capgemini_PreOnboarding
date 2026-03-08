package MOneMock;

import java.util.Scanner;

public class SumMatrix {

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[]=new int[n];
        for(int i=0;i<n;i++){
            matrix[i]=sc.nextInt();
        }
        System.out.println(sum(matrix,n));
    }

    private static int sum(int[] matrix, int n) {
        int maxEven=-1,maxOdd=-1;
        int sMaxEven=-1,sMaxOdd=-1;
        for(int i=0;i<n;i++){
            if(i % 2==0){
                if(matrix[i]>maxEven){
                    sMaxEven=sMaxEven<maxEven ? maxEven:sMaxEven;
                    maxEven=matrix[i];
                }
                else if(sMaxEven>matrix[i]){
                    sMaxEven=matrix[i];
                }
            }
            else{

                if(matrix[i]>maxOdd){
                    sMaxOdd=sMaxOdd<maxOdd ? maxOdd:sMaxOdd;
                    maxOdd=matrix[i];
                }
                else if(sMaxOdd>matrix[i]){
                    sMaxOdd=matrix[i];
                }
            }
        }
        return sMaxOdd+sMaxEven;
    }


}
