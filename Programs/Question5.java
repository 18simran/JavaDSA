package Programs;

public class Question5 
{
static void replace(int a, int b)
{
	int temp = a;
	a= b;
	b =temp;
	System.out.println(a + "a");

}
	public static void main(String[] args)
	{
      int arr[]= {2,5,7,0,4,0,7,-5,8,0};
      
      int j = 0;
      for(int i = 0 ;i < arr.length ;i++)
      {
    	  
    	  
    	  if(arr[i] != 0) 
    	  {

    			int temp = arr[i];
    			arr[i]= arr[j];
    			arr[j] =temp;
    			j++ ;
    			 
    	  }
          
    	 
      }
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      while (j < arr.length) {
          arr[j] = 0;
          j++;
      }
     
	}
}
