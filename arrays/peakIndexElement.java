package arrays;

public class peakIndexElement {
    static int peakIndexElement(int[]arr, int target){
        int peak = peakIndex(arr);
        int firstTry = Binary(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return Binary(arr,target,peak+1,arr.length-1);
    }
    static int Binary(int[] arr, int target,int start,int end){
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
    static int peakIndex(int[]arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <  end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1])
            //you are in decreasing part of array
            {
                end = mid;

            }else{
                //you are in ascending part of arrray
                start = mid+ 1;//bcz we know that  mid +1 > mid element
            }
        }
        return start ;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3 ;
        int ans = peakIndexElement(arr,target);
        System.out.println(ans);
    }
}
