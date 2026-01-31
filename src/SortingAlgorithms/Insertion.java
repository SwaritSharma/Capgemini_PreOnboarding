/*
 Insertion Sort Explanation:

 Insertion sort ek simple comparison-based sorting algorithm hai.
 Isme array ko do parts me imagine kiya jaata hai:
 1) Left part  → hamesha sorted
 2) Right part → unsorted

 Working:
 - Pehla element already sorted maana jaata hai
 - Har iteration me next element (key) uthaya jaata hai
 - Us element ko left side ke sorted part me sahi position par insert kiya jaata hai
 - Jab tak left me bada element milta hai, elements ko right side shift kiya jaata hai
 - Sahi jagah milne par key ko insert kar diya jaata hai

 Important Points:
 - Insertion sort me swapping nahi hoti, sirf shifting hoti hai
 - Left side hamesha sorted rehti hai
 - Nearly sorted array ke liye insertion sort bahut efficient hota hai

 Time Complexity:
 - Best Case: O(n)   (jab array pehle se sorted ho)
 - Average Case: O(n^2)
 - Worst Case: O(n^2)

 Space Complexity:
 - O(1), kyunki sorting in-place hoti hai

 Note:
 - Insertion sort stable algorithm hai
 - Small datasets aur nearly sorted data ke liye useful hota hai
 - Real-world implementations me ye chhote arrays ke liye use hota hai
*/


package SortingAlgorithms;

//import java.util.Arrays;

public class Insertion {

    public static void sort(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
//            System.out.println(i+" iteration "+Arrays.toString(arr));
            int lastSorted=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>lastSorted){
                arr[j+1]=arr[j];
//                arr[j]=-1;
//                System.out.println("shift right "+Arrays.toString(arr));
                j--;
            }
            arr[j+1]=lastSorted;
//            System.out.println("insert at "+Arrays.toString(arr));
//            System.out.println();
        }
    }
}
