package MOneMock;

import java.util.Scanner;

public class Operations {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println(choose(a,b,c));
    }

    private static int choose(int a, int b, int c) {
        if(c==1){
            return a+b;
        } else if (c==2) {
            return a-b;
        } else if (c==3) {
            return a*b;
        }
        return a/b;
    }
}
