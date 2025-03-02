package binaryBit;
import java.util.Scanner ;
public class oddEven {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if((n&1) == 1){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even ");
        }
    }
}
