package Programs;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		 Integer arr [] =  new Integer[size] ;
		 System.out.println("Enter the elements: ");
		 for(int i = 0 ;i < arr.length;i++) {
			 arr[i] = sc.nextInt();
			 }
		System.out.println("enter the elements to be searched: ");
		int item = sc.nextInt();
		int flag = 0 ;
		int i = 0 ;
		for( i = 0 ;i < arr.length;i++) {
			if(arr[i] == item) {
				System.out.println("found");
				flag++;
				break;
			}	
			
		}
//		if(flag == 0) {
//			System.out.println("not found");
//		}
if(i == arr.length) {
	System.out.println("not found");
}
	}

}
