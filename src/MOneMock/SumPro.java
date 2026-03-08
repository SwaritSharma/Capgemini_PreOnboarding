package MOneMock;

import java.util.Scanner;

public class SumPro {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(sumOfSLargestEvenAndSecondSOddPos(arr,n));
    }

    private static int sumOfSLargestEvenAndSecondSOddPos(int[] arr, int n) {
        if(n<=3 || arr==null){
            return 0;
        }
        int evenMax=Integer.MIN_VALUE,evenSMax=Integer.MIN_VALUE;
        int oddSmallest=Integer.MAX_VALUE,oddSSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(i % 2==0) {
                if (evenMax < arr[i]) {
                    if (evenSMax < evenMax) {
                        evenSMax = evenMax;
                    }
                    evenMax = arr[i];
                }
                else if(arr[i]>evenSMax){
                    evenSMax = arr[i];
                }
            }
            else{
                if(oddSmallest>arr[i]){
                    if(oddSmallest<oddSSmallest){
                        oddSSmallest=oddSmallest;
                    }
                    oddSmallest=arr[i];
                }
                else if(arr[i]<oddSSmallest){
                    oddSSmallest=arr[i];
                }
            }
        }
        return evenSMax+oddSSmallest;
    }
}
