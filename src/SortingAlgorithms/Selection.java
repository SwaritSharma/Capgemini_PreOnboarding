/*
 Selection Sort Explanation:

 Selection sort ek simple comparison-based sorting algorithm hai.
 Isme array ko do parts me socha jaata hai:
 1) Left part  → sorted
 2) Right part → unsorted

 Working:
 - Har iteration me unsorted part ka sabse chhota (minimum) element dhunda jaata hai
 - Us minimum element ka index (minIndex) store kiya jaata hai
 - Inner loop poore unsorted part ko scan karta hai
 - Scan ke baad, minimum element ko current position (i) ke saath swap kar diya jaata hai

 Important Points:
 - Har outer loop ke baad ek element apni final correct position par aa jaata hai
 - Har pass me sirf ek swap hota hai
 - Comparisons hamesha poore unsorted part me hote hain

 Time Complexity:
 - Best Case: O(n^2)
 - Average Case: O(n^2)
 - Worst Case: O(n^2)

 Space Complexity:
 - O(1), kyunki sorting in-place hoti hai

 Note:
 - Selection sort simple aur predictable hota hai
 - Swaps kam hote hain, par comparisons zyada
 - Large data ke liye inefficient hota hai
*/

package SortingAlgorithms;

public class Selection {

    public static void swap(int []arr,int big ,int small){
        int temp=arr[big];
        arr[big]=arr[small];
        arr[small]=temp;
    }

    public static void sort(int [] arr){

        int n=arr.length;

        for(int i=0;i<n-1;i++){

            int minIndex=i;

            for(int j=i+1;j<n;j++){

                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }

            }
            swap(arr,i,minIndex);
        }
    }
}
