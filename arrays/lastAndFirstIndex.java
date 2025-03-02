package arrays;
//did not understand
import java.util.Arrays;

public class lastAndFirstIndex {
    static int[] searchRange(int[]arr,int target){
        int []  ans = {-1,-1};
        int start = searchIndex(arr,target,true);
        int end = searchIndex(arr,target,false);
        ans[0] =start;
        ans[1] =end;
        return ans ;
    }
    static int searchIndex(int[]arr,int target,boolean findStartIndex){
//        int []  ans = {-1,-1};
        int ans= -1;
        int start = 0 ;
        int end = arr.length-1 ;
        while(start <= end) {
            int mid = start - (start - end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if(target < arr[mid]){
                end = mid - 1;
            }else{
                ans = mid ;
                if(findStartIndex){
                    end = mid-1 ;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
    public static void main(String[]args){

        int[] arr = {3,7,7,7,7,10,15};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));

    }
}
