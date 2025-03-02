package importantQuestions;
import java.util.Arrays;
//so question is to find duplicated number and find number
//arr = {1,2,2,4}  output- [2,3];
public class questionThree {
    static void swap(int[]arr,int first,int correct){
        int temp = arr[first];
        arr[first]= arr[correct];
        arr[correct] = temp ;
    }
    static int[] find(int[]arr){
    for(int i= 0 ;i <  arr.length ; i++){
        int correct = arr[i] - 1 ;
        if(arr[i] != arr[correct]){
         swap(arr,i,correct);
        }
        if(arr[i]== arr[correct]){
            return new int[]{i,arr[i+1]};
        }
    }
    return new int[] {-1 ,-1};
    }
    public static void main(String[]args){
        int [] arr = {1,2,2,4};
        int[] ans =find(arr);
        System.out.println(Arrays.toString(ans));
    }
}