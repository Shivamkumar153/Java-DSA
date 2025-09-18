//Find largest of three numbers
import java.util.Scanner;
public class FirstDay4 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number a :" );
    int a = sc.nextInt();
    System.out.print("enter the number b :" );
    int b = sc.nextInt();
    System.out.print("enter the number c :" );
    int c = sc.nextInt();
    if(a<b && b<c){
        System.out.println("the largest number is c:"+c);
     }else if(b<a && b<c){
        System.out.println("the largest number is a:"+a);
     }else{
        System.out.println("the largest number is b:"+b);
     }
        

    }
   
}
