//Check even/odd number
import java.util.Scanner;
public class firstDay3 {
    public static void main(String[]args){
        System.out.print("Enter the number:" );
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       if(num%2 == 0){
        System.out.println("the number is even:"+ num);
       }else{
        System.out.println("the number is odd:"+ num);
       }

    }
    
}
