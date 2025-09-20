package LinearSearch;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {{10, 2}, {3, 4}, {5, 6}};
        int ans = Integer.MIN_VALUE; // Store the maximum wealth

        // Iterate through each row
        for (int i = 0; i < arr.length; i++) {
            int sum = 0; // Calculate the sum of the current row
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j]; // Add each element in the row
            }
            // Update the maximum wealth if the current row's sum is greater
            if (sum > ans) {
                ans = sum;
            }
        }

        System.out.println("The maximum wealth is: " + ans);
    }
}
