package LinearSearch;
import java.util.Arrays;

public class SearchBoolean {
    public static void main(String[] args) {
        int arr[] = {12,13,23,4,43,34};
        int traget = 23;
        boolean ans = linearSearch3(arr,traget);

        System.out.println(ans);
    }

    static boolean linearSearch3(int arr[],  int target){
        if(arr.length == 0){
            return false;
        }
        for(int i = 0; i< arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return true;

            }
        }
        return false;


    }
    
}
