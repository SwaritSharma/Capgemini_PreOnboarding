package MOneMock;

import java.util.Scanner;

public class CalculateDistance {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int []p1=new int[2];
        int []p2=new int[2];
        int []p3=new int[2];
        p1[0]= sc.nextInt();
        p1[1]= sc.nextInt();
        p2[0]= sc.nextInt();
        p2[1]= sc.nextInt();
        p3[0]= sc.nextInt();
        p3[1]= sc.nextInt();
        System.out.println(sumDistance(p1,p2,p3));
    }

    private static int sumDistance(int[] p1, int[] p2, int[] p3) {
        int d1 = (int) (Math.sqrt((p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1])));
        int d2 = (int) (Math.sqrt((p3[0] - p2[0]) * (p3[0] - p2[0]) + (p3[1] - p2[1]) * (p3[1] - p2[1])));
        int d3 = (int) (Math.sqrt((p3[0] - p1[0]) * (p3[0] - p1[0]) + (p3[1] - p1[1]) * (p3[1] - p1[1])));
        return d1 + d2 + d3;
    }
}
