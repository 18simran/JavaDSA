package Programs;

public class oddNevenArray {

	public static void main(String[] args) {
		int arr[] = {9,6,3,8,5,2,7,4,1};
		int m = 0;
		int n= 0;
		int even[] = new int[arr.length] ;
		int odd[] = new int[arr.length] ;
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i]%2 ==0 ) {
				even[m] = arr[i];
				m++ ;
			}
			else {
				odd[n] = arr[i] ;
				n++ ;
			}
		}
		System.out.println("even numbers are : ");
		for(int i =  0 ; i < m ;i++) {
			System.out.print( even[i]);
		}
		System.out.println();
		System.out.println("odd numbers are : ");
		for(int i =  0 ; i < n ;i++) {
			System.out.print(odd[i]);
		}
	}
}
