package Programs;

public class primeElement
{
// find prime element in an array 
// find sum of digits whether prime or not
	//hcf and lcm 
	public static void main(String[] args)
	{
		int arr[] = {2,3,5,7,11,10,6,8,3,45,74};
		int prime[] = new int[arr.length];
		int nonprime []=  new int[arr.length] ; 
		int m = 0; int n = 0;
		int i  ;
		int c = 0; 
		for(i = 0 ; i < arr.length ;i++) {
			c =0 ;
			for(int j = 2 ;j < arr[i] ;j++){
				if(arr[i] % j ==0  ) {
					c++ ;
					nonprime[m] = arr[i] ;
					m++ ;
					break ;
				}
				
				
			}
			if(c== 0) {
				prime[n] = arr[i];
				n++ ;
				
			}	
		
		}
		System.out.println("Prime numbers : ");
     for( i = 0 ; i < n ;i++) {
    	 System.out.print(prime[i] + " ");
     }
     System.out.println();
		System.out.println("Non-Prime numbers : ");

     for( i = 0 ; i < m ;i++) {
    	 System.out.print(nonprime[i] + " ");
     }
	} 
	

}
