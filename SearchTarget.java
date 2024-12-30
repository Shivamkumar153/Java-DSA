package LinearSearch;
import java.util.Arrays;

public class SearchTarget {
    public static void main(String[] args){
        int arr[] = {12,32,34,5};
        int target = 32;
        int ans = linearSearch4(arr, target);


    

    if(ans != -1){
        System.out.println( "element"  +   arr[ans]  + "found at index" + ans);
    }else{
        System.out.println("element" + arr[ans]+ "not found at index");
    }
}
    static int linearSearch4(int[]arr, int target){
        if(arr.length == target){
            return -1;

        }
        for(int i = 0; i <arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }

        }
        return -1;
    }
    
}
 


