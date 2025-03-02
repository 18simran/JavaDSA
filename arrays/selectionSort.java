package arrays;

import java.util.Arrays;

public class selectionSort {
    static int Max(int[]arr,int start,int end){
        int max = start;
        for(int i = start ; i <=end ;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[]arr, int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }

    static int[] sort(int[] arr){
        for(int i = 0 ;i < arr.length ;i++){
            int last = arr.length - i - 1;
            int maxIndex = Max(arr,0,last);
            swap(arr,maxIndex,last);
        }
return  arr;
    }
    public static void main(String[]args){
        int[] arr = {4,2,8,4,5,3,1,9,4,6};
        int[]ans =  sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
