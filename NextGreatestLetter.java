package BinarySearch;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'k';
        char ans = nextGreatestLetter(letters, target);

        System.out.println("The next greatest letter is: " + ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // Wrap-around logic: if target is greater than or equal to the largest letter
        if (target >= letters[end]) {
            return letters[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        // `start` now points to the smallest letter greater than the target
        return letters[start % letters.length];
    }
}
