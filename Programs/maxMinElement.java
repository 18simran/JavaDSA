package Programs;

import java.util.Arrays;
import java.util.Scanner ;
public class maxMinElement {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter the size : ");
			int size = sc.nextInt();
			 Integer arr [] =  new Integer[size] ;
			 System.out.println("Enter the elements: ");
			 for(int i = 0 ;i < arr.length;i++) {
				 arr[i] = sc.nextInt();
				 }
//			 int max = arr[0] ;
//			 int min = arr[0];
//			 for(int i = 1; i < arr.length;i++) {
//				 if(arr[i] > max) {
//					 max = arr[i];
//				 }
//				 if(arr[i] <min) {
//					 min = arr[i];
//				 }
//				 
//			 }
//			 for(int i = 0 ;i < arr.length;i++) {
//				System.out.println(arr[i]);
//				 }
//			 System.out.println("maximum number is : " + max);
//			 System.out.println("minimum number is : " + min);
//			 Arrays.sort(arr, 
			 Arrays.sort(arr);
			 System.out.println("maximum number is : " + arr[arr.length- 1]);
		 System.out.println("minimum number is : " + arr[0]);

		 }
}
