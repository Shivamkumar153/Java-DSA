package LinearSearch;

import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {11, 12, 32, 43, -12};
        int target = -12;
        int ans = linearSearch(arr, target);

        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) { // Fixed method signature
        if (arr.length == 0) { // Check if the array is empty
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return element ; // Return the index of the target
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
