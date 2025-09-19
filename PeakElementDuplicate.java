//This is for duplicat value in the Roatation arrays .

package BinarySearch;

public class PeakElementDuplicate {
    public static void main(String[] args) {
        int arr[] = {2,2,9,2,2};

        System.out.println(findPivot(arr)); // Output the pivot
        System.out.println(search(arr, 9)); // Example: Searching for target 3
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            // No pivot means array is not rotated; perform normal binary search
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }

        return binarysearch(nums, target, pivot + 1, nums.length - 1);
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


