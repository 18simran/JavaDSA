package arrays;
import java.util.Arrays;
public class cyclicSort {
    static void swap(int []arr,int first,int correct){
        int temp = arr[first];
        arr[first] =arr[correct];
        arr[correct]= temp ;
    }
    static int[] insertion(int[]arr){
        int i = 0 ;
       while(i < arr.length ){
            int correct = arr[i] - 1 ;
            if(arr[correct] != arr[i]){
              swap(arr,i,correct);
            }else{
                i++;
            }
        }
return arr ;
    }
    public static void main(String[]args) {
        int[] arr = {3,4,2,1,5};
        int[] ans = insertion(arr);
        System.out.println(Arrays.toString(ans));
    }
}
