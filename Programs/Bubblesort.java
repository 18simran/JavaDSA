package Programs;

public class Bubblesort {
//if u have n number of elements, then it will take n-1 number of steps 
	public static void main(String[] args) {
    int arr[] = {4,2,5,3,6 };
    for(int i = 0; i < arr.length-1 ;i++) //number of steps
    {
    	for(int j = 0 ; j < arr.length-1 ;j++ ) //comparison
    		{
    		if(arr[j] > arr[j+1]) {
    			int temp = arr[j];
    			arr[j]= arr[j+1];
    			arr[j+1] =temp ;
    		}
    		
    	}
    	
    }
    
for(int i = 0 ; i< arr.length; i++) {
	System.out.print(arr[i] + " ");
}
		
	}

}
