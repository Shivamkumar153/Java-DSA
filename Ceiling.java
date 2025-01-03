
// CEILING - Smallest element in array which is greater or equal to the target element. 
package BinarySearch;
import java.util.Arrays;

public class Ceiling {
    public static void main(String[]args){
        int arr[] = {2,3,5,9,14,16,18};
        int target = 4;
        int ans = Ceiling(arr, target);

        System.out.println(ans);

    }

    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target >= arr.length-1){
            return -1;
        }

        while(start <= end){
            int  mid = start + (end - start) /2 ; 
         
          
         if(target < arr[mid]){
             end =  mid - 1;
 
             
         }else if(target > arr[mid]){
             start = mid + 1;
         }else {
 
         
         
         return mid;
        }
    }

         return start;

            
        
    }
    
    }
