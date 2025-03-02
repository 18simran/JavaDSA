package arrays;
import java.util.Arrays;
import java.util.Scanner;
// 1 2 3
// 4 5 6
// 7 8 9
public class programOne {
    static void getElements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int rSize = sc.nextInt();
        int cSize = sc.nextInt();
        int [][] arr = new int[rSize][cSize];
        for(int i = 0 ;i < rSize; i++ ) {
            for (int j = 0; j < cSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       printElements(arr);
        sc.close();
    }
static void printElements(int[][]arr){
        Scanner sc = new Scanner (System.in);
    System.out.println("Enter the search elemnt: ");
    int s = sc.nextInt();
    for(int i = 0 ;i < arr.length; i++ ) {
        for (int j = 0; j < arr[i].length; j++) {
            if (s == arr[i][j]) {
                System.out.println(i+ " "+ j);
            }
        }
        System.out.println();
    }
}
    public static void main(String []args)
    {
        getElements();
    }
}
