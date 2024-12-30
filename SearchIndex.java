//Find whether 14 exists in Array or not.
package LinearSearch;

import java.util.Arrays;

public class SearchIndex{
    public static void main(String[] args) {
        int[] arr = {12, 13, 15, 23, 32};
        int target = 33;
        int ans = LinearSearch1(arr, target); // Corrected method call
        System.out.println(ans); // Fixed syntax
    }

    static int LinearSearch1(int[] arr, int target) { // Fixed method declaration
        if (arr.length == 0) { // Check if the array is empty
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found after the loop
    }
}
