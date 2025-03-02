package Programs;
import java.util.Scanner ;
public class fibonacci {
// 0 1 1 2 3 5 8
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int a = 0 ;
int b = 1 ;
System.out.println("Enter the number : ");
int n = sc.nextInt();
if(n == 1) {
	System.out.println(0);
}else if(n > 1) {
	System.out.print(a + " " + b + " ");

for(int i = 0 ;i < n - 2 ;i++) {
	int c = a + b;
	System.out.print(c + " ");
	a =b ;
	b = c ;
}
	}
	} 
}
