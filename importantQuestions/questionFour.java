package importantQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class questionFour {
    static void swap(int[] arr, int first, int correct) {
        int temp = arr[first];
        arr[first] = arr[correct];
        arr[correct] = temp;
    }
    static List<Integer> findSingleDuplicate(int[] arr) {
       int i = 0;
       while(i < arr.length){

                int correct = arr[i] - 1;
                if ( arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }

            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
       for(int index = 0 ; index < arr.length;index++){
           if(arr[index]!= index + 1 ){
               ans.add(arr[index]);
           }
       }
       return ans;
    }
        public static void main (String[]args){
            int[] arr = {4,3,2,7,8,2,3,1};
            List<Integer> ans = findSingleDuplicate(arr);
            System.out.println((ans));
        }
}