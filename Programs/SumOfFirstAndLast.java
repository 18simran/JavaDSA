package Programs;

public class SumOfFirstAndLast {

	public static void main(String[] args) {
		int n = 5545 ;
		int num = Sum( n);
		System.out.println("Sum of First and Last Digit is :  " + num);
	}
	static int Sum(int number ) {
		int numOfDigits  = String.valueOf(number).length() ;
		
	int  firstDigit = number / (int)Math.pow(10,numOfDigits  - 1) ;
	int lastDigit = number % 10 ;
	
		int sum = firstDigit + lastDigit ;
		return sum ;
	}
		
	

}
