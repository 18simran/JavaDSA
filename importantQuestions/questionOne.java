package importantQuestions;

import java.util.Arrays;

//So the question is you have given a array of 1 to n elements you
//will have to find that one missing value . For Example : {4,0,2,1} output = 3
public class questionOne {
    static void swap(int[]arr,int first,int correct){
        int temp = arr[first] ;
        arr[first] = arr[correct];
        arr[correct] = temp ;
    }
    static int  findMissing(int[]arr){
        int i = 0 ;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
       //search for missing number
        for(int index = 0 ; index < arr.length ;index++){
            if(arr[index] != index){
                return index ;
            }
        }
        return arr.length ;
    }
    public static void main(String[]args) {
        int[] arr = {4,0,2,1,6,3,8,5};
        int ans = findMissing(arr);
        System.out.println((ans));
    }
}
