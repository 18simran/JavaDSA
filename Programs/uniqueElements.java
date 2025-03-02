package Programs;
import java.util.Arrays; ;
public class uniqueElements {
//Find Unique  Elements 
	public static void main(String[] args) {
		int []arr = {2,3,4,2,5,6,6} ;
			Arrays.sort(arr) ;
			int i = 0, c = 1 ;
		for( i = 0 ;i< arr.length -1;i++) {
			if(arr[i] ==arr[i+1]) {
				c++ ;
				
			}
			if(arr[i] != arr[i+1] ) {
				
//				System.out.println(arr[i] + " comes " + c + " times");
				if(c > 1) {
				System.out.println(arr[i] + " is duplicate");
				}
				c = 1;
			}
		}
	
//	System.out.println(arr[i] + " comes " + c + " times");
		if(c > 1) {
			System.out.println(arr[i] + " is duplicate");
		}

	}

}
