//question no 34 of leetcode(i have some confusion)

package BinarySearch;
import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;

        int[] result = findFirstAndLast(nums, target);

        System.out.println(Arrays.toString(result)); // Output: [1, 4]
    }

    static int[] findFirstAndLast(int[] nums, int target) {
        int i = -1; // Index from the start
        int j = -1; // Index from the end

        // Search from the start to find the first occurrence
        for (int start = 0; start < nums.length; start++) {
            if (nums[start] == target) {
                i = start;
                break; // Stop once the first occurrence is found
            }
        }

        // Search from the end to find the last occurrence
        for (int end = nums.length - 1; end >= 0; end--) {
            if (nums[end] == target) {
                j = end;
                break; // Stop once the last occurrence is found
            }
        }

        return new int[]{i, j};
    }
}
