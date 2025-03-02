package OOPS;

public class call_by_value
{
	int fun(int num)
	{ //double is of 8 bytes and int is of bytes therfore it can fit easily
	int t = 1 ;int i;
	for( i = num ;i >0 ; i--)
	{
		t = t * i ;
		
	}
	return t ;
	}

	public static void main(String[] args) 
	{

		int n = 5 ;
		call_by_value obj = new call_by_value() ;
		int sum = 0;
		
		for(int i = 1 ;i <= 5 ;i++) 
		{
			int fact  =obj.fun(i);
			sum = sum + fact ;
			System.out.println(fact);
			
		}
		System.out.println("sum of 5 factorials is : " + sum);
		
	}

}
//6-7 decimal float is of 4 byte 
//more than that double is of 8 byte