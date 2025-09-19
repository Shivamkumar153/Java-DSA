// In this program first i have to show that the given element is shorted or not and the find the element.
package BinarySearch;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        int arr[] = {98,87,76,65,54,43,32,21};
        int target = 54;
        int ans = OrderAgnosticBS(arr, target);

        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the target is found
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                // Ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // Return -1 if the target is not found
        return -1;
    }
}
