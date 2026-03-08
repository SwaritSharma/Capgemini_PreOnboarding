package MOneMock;

import java.util.Scanner;

public class RatsFoodDistribution {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int rats=sc.nextInt(),units=sc.nextInt(),n=sc.nextInt();
        int []houses=new int[n];
        for(int i=0;i<n;i++){
            houses[i]=sc.nextInt();
        }
        System.out.println(sufficientFoodCheck(rats,units,houses,n));
    }

    private static int sufficientFoodCheck(int rats, int units, int[] houses, int n) {
        if(houses==null){
            return -1;
        }
        int total=0;
        for(int i=0;i<n;i++){
            if(total>=rats*units){
                return i;
            }
            total+=houses[i];
        }
        return 0;
    }
}
