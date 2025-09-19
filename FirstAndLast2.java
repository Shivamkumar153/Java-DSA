package BinarySearch;
import java.util.Arrays;

public class FirstAndLast2 {
    public static void main(String[]args){
        int arr[]= {5,6,7,7,7,9,10};
        int target = 7;
        int ans = FirstAndLast2(arr, target);

        System.out.println(ans);
    }
    static int FirstAndLast2(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2; 

            if(target < arr[mid]){
                start = mid+1;

            }else if(target > arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return -1;

    }
}
            


            
            
       

    
    

