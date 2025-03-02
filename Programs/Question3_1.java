package Programs;
//find missing element if it starts with 0 
public class Question3_1 
{

	public static void main(String[] args) 
	{
		int arr[] = {0,5,2,4,8,6,9,3,1};
		int temp[] = new int[arr.length + 1] ;
		for(int i = 0 ;i < arr.length ;i++) 
		{

		   temp[arr[i]] = 1 ;
		
		}
		for(int i = 0 ; i < temp.length;i++) {
			if(temp[i] == 0) {
				System.out.println("The missing number is : " +i);
			}
		}
	}

}
