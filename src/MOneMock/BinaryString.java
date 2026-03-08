package MOneMock;

import java.util.HashMap;
import java.util.Scanner;

public class BinaryString {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(OperationsBinaryString(str));
    }

    private static int OperationsBinaryString(String str) {
        int res=0;
        int i=0,n=str.length();

        while(i<n && str.charAt(i)!='A' && str.charAt(i)!='B' && str.charAt(i)!='C'){
            i++;
        }

        char operator=str.charAt(i);

        res+=Integer.parseInt(str.substring(0,i),2);

        i=i+1;

        while(i<n){

            int j=i;

            while(j<n && str.charAt(j)!='A' && str.charAt(j)!='B' && str.charAt(j)!='C'){
                j++;
            }

            int temp=Integer.parseInt(str.substring(i,j),2);

            res=calculation(res,temp,operator);

            if(j>=n)break;

            operator=str.charAt(j);

            i=j+1;
        }
        return res;
    }

    private static int calculation(int left,int right,char operator) {
        if(operator=='A'){
            return left & right;
        }
        else if(operator=='B'){
            return left | right;
        }
        return left ^ right;
    }
}
