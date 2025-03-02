package Programs;
public class new_code {
//swap last and first digit 
	public static void main(String[] args) {
		int n = 325 ;
		int num = swap( n);
		System.out.println(num);
	}
	static int swap(int number ) {
		int numOfDigits  = String.valueOf(number).length() ;
		
	int  firstDigit = number / (int)Math.pow(10,numOfDigits  - 1) ;
	int lastDigit = number % 10 ;
	int remainingDigits  = number % (int) Math.pow(10, numOfDigits - 1) / 10;
		int swappedNum = lastDigit * (int) Math.pow(10, numOfDigits - 1) + remainingDigits * 10 + firstDigit; 
		return swappedNum ;
	}
	}
