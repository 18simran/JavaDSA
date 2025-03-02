package Programs;
import java.util.Scanner;

public class digitPrimary {

    // Function to check if a number is prime
 
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    // Function to calculate the sum of digits of a number
    static   int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Checking whether sum of digits of each element is prime or not:");
        for (int i = 0; i < size; i++) {
            int sum = sumOfDigits(arr[i]);
            if (isPrime(sum))
                System.out.println("Sum of digits of element at index " + i + " is prime.");
            else
                System.out.println("Sum of digits of element at index " + i + " is not prime.");
        }
        sc.close();
    }
}
