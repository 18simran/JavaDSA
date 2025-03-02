package Programs;
import java.util.Scanner;
//HCF and LCM of two numbers 
public class LcmAndHcf {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int num1 = sc.nextInt();
int num2 = sc.nextInt() ;
int temp = 0 ;
for(int i =1; i <= num1; i++) {
	if(num1% i == 0 && num2 % i ==0) {
		temp = i ;
	}
}
System.out.println("HCF is : " + temp);
int lcm =  num1 * num2  /temp ;
System.out.println("LCM is " + lcm);
sc.close();
}
} 