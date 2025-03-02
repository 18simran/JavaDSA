package Programs;
import java.util.Scanner ;
public class Question1 {
//Program to find a pair with given sum in the array.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		int arr[] = {6,8,4,-5,7,9,6} ;
		for(int i = 0 ;i < arr.length ;i++) {
			for(int j = i+1 ;j < arr.length ;j++) {
				int add = arr[i] + arr[j];
				if(add == sum) {
					System.out.println("Elements of index " +i +  " and " + j + " can make the sum " +sum );
				}
			}
			
		}
}

}
