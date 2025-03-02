package Programs;
//Rotate array from nth position 
public class Question4
{
static int[] reverse( int arr1[],	int start,int end) 
{
	while(start < end) 
	{
		int temp = arr1[start];
		arr1[start] = arr1[end];
		arr1[end] = temp ;
		start++;
		end-- ;
	}
	
	return arr1;
}
	public static void main(String[] args) 
	{
		int arr[] =  {2,4,6,7,2,3,4,5,8,7,9};
		int len =arr.length ;
		int end = len-1;
		int pos = 5 ;
		int result[] = reverse(arr,0,end);
		result = reverse(arr,0, end-pos);
		result = reverse(arr,len-pos, end);
		for(int i = 0 ; i < result.length;i++)
		{
			System.out.print(result[i] + " ");
		}
	}
	
}
