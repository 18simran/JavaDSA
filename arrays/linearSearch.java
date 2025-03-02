package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static int Search( int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
for(int i = 0 ; i < arr.length ;i++){
    if(target == arr[i]){
        return i ;
    }
}
return Integer.MIN_VALUE ;
// consider returning some other value like bool or integer min value coz there
// might be the case you are searching for -1 and you won't know whether -1
// is the element or false value.
    }
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size;i++ )
        {
            arr[i] = sc.nextInt();
        }
       int result =  Search(arr,15);
        System.out.println(result);
    }
}
