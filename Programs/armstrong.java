package Programs;

public class armstrong {

	public static void main(String[] args) {
int count = 0 ;
int num = 153 ;
int temp = num ;
int sum = 0;
int r ;
while(num > 0) {
	num = num /10 ;
	count++ ;
	
}
num = temp ;
System.out.println(num);

while(num > 0) {
	r = num % 10 ;
	sum = sum +(int)Math.pow(r, count) ;
	num = num /10 ;
	
}
if(sum == temp ) {
	System.out.println("yes");
}
else {
	System.out.println("no");
}
	}

}
