package arrays;
import java.util.Scanner ;
import java.util.Scanner;
public class binarySearch {
    static int Binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //finding mid element
    int mid = start +(end-start)/2; // start + end/2 may exceed the integer value
            if(target == arr[mid]){
                return mid ;
            }
            if(isAsc){
    if(target < arr[mid]){
        end = mid - 1;
    }else {
        start = mid + 1;
    }}
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }}
        }
return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,3,3,3};
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the element you want to find : ");
        int target = sc.nextInt();
        int ans = Binary(arr, target);
        System.out.println(ans);
    }
}