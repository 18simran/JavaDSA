package Programs;

public class mergeTwoArrays {

	public static void main(String[] args) {
		int arr1[] = {5,4,3,2,1,} ;
		int arr2 [] = {9,8,7,6,5};
  int new_length = arr1.length + arr2.length ;
  System.out.println(new_length);
  int arr [] = new int[new_length] ;
  for(int i = 0 ;i < arr1.length ;i++) {
	 
		  arr[i] = arr1[i] ;	  
	 	
  }
  for(int i = 0 ;i < arr2.length;i++)
  {
	  arr[arr1.length+ i] = arr2[i];
  }
  for(int i = 0 ;i < arr.length;i++)
  {
	 System.out.print(arr[i] + " ");
  }
	}

}
