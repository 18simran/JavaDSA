package arrays;
//on notebook

public class ceilingOfNumber {
    static int searchCeiling(int[]arr,int target){
        int start = 0 ;
        int end = arr.length ;
        while(start <= end) {
            int mid = start - (start - end) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
    public static void main(String[]args){
        int[] arr = {2,3,5,7,9,11,14,20,22,25};
        int target = 10;
       int ans = searchCeiling(arr,target) ;
        System.out.println(ans);
    }
}
