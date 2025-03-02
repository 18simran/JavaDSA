package Programs;
public class TestRun {
//linear search 
	public static void main(String[] args) {
		int arr[] = {5,7,9,4,6} ;
		int i ,find = 57, c = 0;
		for( i = 0 ;i < arr.length ; i++ ) {
			if(arr[i] == find) {
				c++ ;
				System.out.println("found");
				break;
			}		
		}
		if(c == 0 ) {
			System.out.println("not found");
		}
 }

}
