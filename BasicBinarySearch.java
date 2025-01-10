import java.util.Arrays;
public class BasicBinarySearch {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target = 5;
        int r = 0;
        int c = arr.length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c] == target){
                System.out.println("Target found at position: (" + r + ", " + c + ")");
                return;
            }
            if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        System.out.println( "not find the : (-1, -1)");
    }
}
