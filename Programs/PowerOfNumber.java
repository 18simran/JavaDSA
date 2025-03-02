package Programs;

public class PowerOfNumber {

	public static void main(String[] args) {
int n = 3 ;
int num = 5 ;
int pow  = 1 ;
//int pow = (int)Math.pow(num, n) ;// 125
 
for(int i = 0 ; i < n ; i++) {
	pow = pow * num ;
 }
 System.out.println(num + " Power " + n + " is : " +pow);
	}

}
