package Programs;
import java.util.Scanner;
//scanner is a class in util package 
//data and function 
public class ArrayProgram {

	public static void main(String[] args) {

//		int []arr = {1,21,3,4,5};
		int [] yes = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ;i < yes.length ;i ++) {
			yes[i] = sc.nextInt();
		
		}
		sc.close();
				for(int i = 0; i < yes.length ;i++) {
			System.out.println(yes[i]);
		}
		
	}

}
