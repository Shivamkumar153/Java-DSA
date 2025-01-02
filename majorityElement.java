package LinearSearch;

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        // Find and return the majority element
        return findMajorityElement(nums);
    }

    public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> numberCount = new HashMap<>();

        // Count occurrences of each number
        for (int n : nums) {
            numberCount.put(n, numberCount.getOrDefault(n, 0) + 1);
        }

        // Find the majority element (more than n/2 occurrences)
        int majorityCount = nums.length / 2;
        for (int num : numberCount.keySet()) {
            if (numberCount.get(num) > majorityCount) {
                return num; // Return the majority element
            }
        }

        return -1; // Return -1 if no majority element exists (shouldn't happen for valid input)
    }
}

public class majorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,4,3,4,4};
        System.out.println("Majority Element: " + solution.majorityElement(nums));
    }
}
