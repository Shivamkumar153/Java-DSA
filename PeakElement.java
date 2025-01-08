import java.util.Arrays;
public class PeakElement {
    public static void main(String[]args){
        int arr[]= {1,2,3,4,5,3,1};

        System.err.println(findPivot(arr));
    }
    static int search(int[]nums, int target){
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarysearch(nums,target,0,nums.length-1);
        }if(nums[pivot]==target){
            return pivot;
        }
        if(target >= target){
            return pivot;

        }if(target >= nums[0]){
            return binarysearch(nums,target,0,pivot-1);

        }
        return binarysearch(nums,target,pivot-1,nums.length-1);
    }
    static int binarysearch(int[]nums,int target,int start,int end){

        while (start <= end) {
            int mid = start +(end - start)/2;

            if(target< nums[mid]){
                end = mid -1;

            }else if(target > nums[mid]){
                start = mid +1;
            }else {
                return mid;
            }
            
        }

        return -1;
    }
    static int findPivot(int[]nums){
        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            
            if(mid<end && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<= nums[start]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
            

            
        

    

