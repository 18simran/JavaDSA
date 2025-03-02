package Programs;

public class ReverseNumber {

	public static void main(String[] args) {
          int n = 151 ;int sum = 0 ;
          int temp = n ;
          int r ;
          while(n > 0) {
        	  r = n % 10 ; 
        	  sum = (sum* 10)+ r ;
        	  n = n/ 10 ; 
          }
         
          if(sum == temp) {
        	  System.out.print("It is pallindrome"); 
          }
          else {
        	  System.out.print("not pallindrome "); 
          }       
	}
	}


