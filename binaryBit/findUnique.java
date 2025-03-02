package binaryBit;
import java.lang.reflect.Array;

public class findUnique {
    static int unique(int[]arr) {
        int unique = 0 ;
        for (int i = 0; i < arr.length; i++) {
          unique ^= arr[i] ;
            System.out.println(unique);
        }
        return unique ;
    }
    public static void main(String[]args) {
       int[] arr  = {2,3,4,1,2,1,3,6,4};
       int ans = unique(arr);
        System.out.println(ans);
       }
    }


