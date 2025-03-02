package Programs;

public class test1 {

	public static void main(String[] args) {
	try {
		int a = 10 ;
		int b = 0;
		int c = a /b ; //arithmetic exception
		System.out.println(c) ;
		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e) ;
	}
	System.out.println("we reached here ") ;
	}
//		int a = 10 ;
//		int b = 0;
//		int c = a /b ; //arithmetic exception
//		System.out.println(c) ;
//		System.out.println("hii") ;
	}
