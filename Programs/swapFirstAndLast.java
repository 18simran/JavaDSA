package Programs;
import java.util.Scanner ;
public class swapFirstAndLast {

	public static void main(String[] args) {
	
		  
		        Scanner sc= new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int swappedNumber = swap(num);

		        System.out.println("Number after swapping first and last digits: " + swappedNumber);
		    }

		    static int swap(int number) {
		    	
		      
		        int numberOfDigits = String.valueOf(number).length();

		        // Extract the first digit
		        int firstDigit = number / (int) Math.pow(10, numberOfDigits - 1);
System.out.println(firstDigit);
		        // Extract the last digit
		        int lastDigit = number % 10;

		        // Remove the first and last digits
		        int remainingDigits = number % (int) Math.pow(10, numberOfDigits - 1) / 10;

		        // Construct the new number by swapping the first and last digits
		        int swappedNumber = lastDigit * (int) Math.pow(10, numberOfDigits - 1) + remainingDigits * 10 + firstDigit;

		        return swappedNumber;
		    }
		
	}