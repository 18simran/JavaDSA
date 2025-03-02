package Programs;

public class Question2
{
//Program to find the number occuring odd number of times in an array.
	public static void main(String[] args)
	{
		
      int arr[] = {8,3,8,5,4,3,4,3,5};
      int arr1[] = new int[arr.length];
      for(int i = 0 ;i< arr.length ;i++) {
    	  int c = 0 ;
    	  for(int j = i+ 1 ;j < arr.length ;j++ ) {
    		  if(arr[i] == arr[j]) {
    			  c++ ;
    		  }
    		  
    	  }
//    	System.out.println(arr[i] + "comes " + c);
		  if(c % 2 != 0) {
			  System.out.println(arr[i]);
			  break ;
			 
		  }
    	     
      }
	}

}
