package arrays;
//find minimum element in an array

public class findMinimumElement {
    public static void main(String[]args){
        int[] arr = {10 ,-15 ,7,-1, 4,5,10};
        int min = 0;
        for(int i = 0 ;i < arr.length ;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}