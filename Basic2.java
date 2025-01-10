import java.util.Arrays;
public class Basic2 {
    public static void main(String[]args){
        int arr[][] = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target = 38;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                if(arr[i][j]==target){
                    System.out.println("Target found at position: (" + i + ", " + j + ")");
                    return;
                }

            }
            
        }
        System.out.println("target not found");

    }
    
}
