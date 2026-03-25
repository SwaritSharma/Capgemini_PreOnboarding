package Logical;

import java.util.*;

public class GroceryDiscountCalculation {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> items=new HashMap<>();
        int i=0;
        while(i<n){
            String item=sc.next();
            int price=sc.nextInt();
            items.put(item,price);
            i++;
        }
        HashMap<String,Integer> discount=new HashMap<>();
        int d=sc.nextInt();
        i=0;
        while(i<d){
            String item=sc.next();
            int dis=sc.nextInt();
            discount.put(item,dis);
            i++;
        }

        HashMap<String,Integer> list=new HashMap<>();
        int g=sc.nextInt();
        i=0;
        while(i<g){
            String item=sc.next();
            int quantity=sc.nextInt();
            list.put(item, list.getOrDefault(item,0) + quantity);
            i++;
        }
        System.out.println();

        Map<String,int[]> bi=bill(items,discount,list);
        for(String s:bi.keySet()){
            System.out.println(s+" "+Arrays.toString(bi.get(s)));
        }
    }

    private static TreeMap bill(HashMap<String, Integer> items, HashMap<String, Integer> discount, HashMap<String, Integer> list) {
        TreeMap<String,int []> bill=new TreeMap<>();
        for(String i:list.keySet()){
            int quantity=list.get(i);
            if(discount.containsKey(i)){
                int price=items.get(i);
                int newPrice=price-((price * discount.get(i))/100);
                bill.put(i,new int[]{items.get(i),newPrice*quantity});
            }
            else{
                bill.put(i,new int[]{items.get(i),items.get(i)*(quantity)});
            }
        }
        return bill;
    }
}
