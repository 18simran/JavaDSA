package arrays;
import java.util.Arrays;
public class insertionSort {
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static  int[] insertion (int []arr){
        for(int i = 0 ; i < arr.length - 1 ;i++){
            for(int j = i + 1; j >0 ;j--){
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j - 1);
                }else{
                    break;
                }
            }
        }
        return arr ;
    }
    public static void main(String[]args) {
        int[] arr = {6,2,4,7,1};
        int[] ans = insertion(arr);
        System.out.println(Arrays.toString(ans));
    }
}