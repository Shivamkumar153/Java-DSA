public class Basic {
    public static void main(String[] args) {
        int[][] array = {{18, 9, 12}, {36, -4, 91}, {44, 33, 16}};
        int target = 91;

        // Searching for the target in the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Target found at position: (" + i + ", " + j + ")");
                    return;
                }
            }
        }

        System.out.println("Target not found in the array.");
    }
}
