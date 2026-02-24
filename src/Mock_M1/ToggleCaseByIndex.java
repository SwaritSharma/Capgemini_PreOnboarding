package Mock_M1;

import java.util.Scanner;

public class ToggleCaseByIndex {
    public static void toggle(String s){

        String arr[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String curr=arr[i];
            for(int i1=0;i1<curr.length();i1++){
                if(i1 % 2==0){
                    sb.append(Character.toUpperCase(curr.charAt(i1)));
                }
                else {
                    sb.append(Character.toLowerCase(curr.charAt(i1)));
                }
            }
            if(i!=arr.length-1)
                sb.append(" ");
        }
        System.out.println(sb.toString());
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        toggle(str);
    }
}
