package importantQuestions;

import java.util.Arrays;

//So the question is find ana duplicate numbers and return those numbers in array form
public class questionTwo {
    static void swap(int[]arr,int first,int correct){
        int temp = arr[first];
        arr[first]= arr[correct];
        arr[correct] = temp ;
    }
    static int[] finDuplicates(int[]arr){
        for(int i = 0 ; i < arr.length ;i++){
            int correct = arr[i] - 1 ;
            if(arr[i] != arr[correct]){
               swap(arr,i,correct);
            }
            if(arr[i]== arr[correct]){
               return new int[]{i, arr[i]};
            }
        }
return new int[]{-1, -1};
    }
    public static void main(String[]args){
        int [] arr = {4,3,2,7,8,2,3,1};
        int[] ans = finDuplicates(arr);
        System.out.println(Arrays.toString(ans));

    }
}
