//Swap two numbers (with and without third variable)
public class FirstDay2{
    public static void main(String[]args){
        int a = 10;
        int b = 5;
        System.out.println("before swap a:"+a +"b:"+b);
        a = a +b; // a = 10+5 = 15;
        b = a-b; // b = 15-5 = 10;
        a = a-b; // a = 15-10 = 5;
        System.out.println("after  swap a:"  +a +"b:"+b);

    }
    
}
