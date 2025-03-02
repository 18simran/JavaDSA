package Programs;

public class prime {

	public static void main(String[] args) {
int num = 25,i , c = 0  ;
for( i = 2 ;i < num ; i++) {
	if(num % i == 0) {
	c++ ;
	System.out.print("not prime ");
		break ;
	}
	
}
if(c == 0) {
	System.out.print(" prime ");
}

	}
}
