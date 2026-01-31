/*
 Bubble Sort Explanation:

 Bubble sort ek simple comparison-based sorting algorithm hai.
 Isme adjacent (saath-saath) elements ko compare kiya jaata hai.

 Working:
 - Array ke first element ko second element se compare karte hain
 - Agar order galat ho (arr[j] > arr[j+1]), to dono ko swap kar dete hain
 - Ye process poore array ke liye repeat hota hai

 Important Observation:
 - Har outer loop ke baad sabse bada element end me "bubble" ho jaata hai
 - Isliye har next pass me last ke sorted elements ko skip kar dete hain (n-1-i)

 Optimization:
 - Ek boolean flag `swapped` use kiya jaata hai
 - Agar kisi pass me ek bhi swap nahi hota,
   to matlab array already sorted hai
 - Is case me algorithm wahi stop ho jaata hai

 Time Complexity:
 - Worst Case: O(n^2)  (array reverse sorted ho)
 - Average Case: O(n^2)
 - Best Case: O(n)    (array pehle se sorted ho aur swapped flag use ho)

 Space Complexity:
 - O(1), kyunki sorting in-place hoti hai

 Note:
 - Bubble sort simple hai par large data ke liye inefficient hota hai
 - Learning aur basic understanding ke liye best algorithm hai
*/
package SortingAlgorithms;

public class Bubble {

    public static void swap(int[] arr, int big, int small){
        int temp=arr[small];
        arr[small]=arr[big];
        arr[big]=temp;
    }
    public static void sort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
