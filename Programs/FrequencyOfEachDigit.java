package Programs;

public class FrequencyOfEachDigit {

	public static void main(String[] args) {
		
	       int digit [] = new int [10];
	       int n = 521145 ;
	       int  p =n ,dig;
	       while(p > 0) {
	    	   dig = p% 10 ;
	    	   for(int i =0 ;i <= 9 ;i++) {
	    		   if(dig == i) {
	    			   digit[i] ++;
	    		   }
	    		   
	    	   }
	    	   p  = p /10 ;
	    	   
	       }
	
	for(int i = 0 ; i <= 9 ;i++) {
		if(digit[i] != 0) {
			System.out.println(i +" comes " + digit[i] + " times. ");
		}
	}

	} 
	    }
		

	


