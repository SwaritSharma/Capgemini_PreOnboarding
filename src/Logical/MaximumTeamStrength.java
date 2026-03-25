package Logical;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumTeamStrength {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []skills=new int[n];
        for(int i=0;i<n;i++){
            skills[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int []teams=new int[m];
        for(int i=0;i<m;i++){
            teams[i]=sc.nextInt();
        }
        System.out.println(maxTeamStrength(skills,teams,n,m));
    }

    private static int maxTeamStrength(int[] skills, int[] teams, int n, int m) {
        int strength=0;
        Arrays.sort(skills);
        Arrays.sort(teams);
        int lastPlayer=n-1;
        for(int i=0;i<m;i++){
            strength+=skills[lastPlayer]+skills[lastPlayer-teams[i]+1];
            lastPlayer-=teams[i];
        }
        return strength;
    }
}
