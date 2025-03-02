package arrays;

import java.util.Arrays;

public class bubbleSort {
    static int[] sort(int[]arr){
        boolean swap = false;
     for(int i = 0 ;i <= arr.length  ; i++){
         for(int j = 1 ; j <arr.length - i ;j++){
             if(arr[j] <  arr[j -1]){
                 int temp = arr[j];
                 arr[j] = arr[j-1];
                 arr[j-1] =  temp;
                 swap = true ;
             }
         }
         if(!swap){
             break;
         }
     }
     return arr;
    }
    public static void main(String[]args){
        int[] arr = {3,1,4,2,5};
        int[]ans =  sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
