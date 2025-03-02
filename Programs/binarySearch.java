package Programs;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		//array must be in a sorted form 
		
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
		int beg = 0 ;
		int c = 0;
		int end = arr.length - 1;
		int mid= (beg+end)/2 ;
		while(beg <= end) {
			if(item == arr[mid]) {
				System.out.println("found");
				c++ ;
				break ;
			}
			 if(item > arr[mid]) {
				beg = mid+ 1 ;
				
			}
			else {
				end= mid - 1;
			}
			mid= (beg+end)/2 ;
		}
		if(c == 0) {
			System.out.println("not found");
		}
			 

	}

}
