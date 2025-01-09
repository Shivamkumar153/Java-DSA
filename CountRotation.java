package BinarySearch;

public class CountRotation {
    public static void main(String[] args) { // Fixed typo in "mian" to "main"
        int nums[] = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(RotationCount(nums)); // Corrected method call
    }

    private static int RotationCount(int[] nums) {
        int pivot = findPivot(nums);
        // If the pivot is -1, the array is not rotated
        return pivot == -1 ? 0 : pivot + 1; // Fixed return logic
    }

    static int binarysearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Handle duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // Check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is pivot
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } 
            // Left part is sorted; pivot is in the right
            else if (nums[start] <= nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}



    

