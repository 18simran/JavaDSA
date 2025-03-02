package Programs;

public class factors {

	public static void main(String[] args) {
		int num = 32;
		int count = 0;
for(int i= 1 ; i <= num ; i++ ) 
{
	if(num% i == 0) {
		count++;
		System.out.println(i);
		
	}
}

//System.out.println("Total number of factors are " + count);
if(count == 2) {
	System.out.println("prime");
}
else {
	System.out.println("not prime ") ;
}
	}

} 