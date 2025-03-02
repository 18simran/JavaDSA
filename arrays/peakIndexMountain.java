package arrays;

public class peakIndexMountain {
    static int peakIndex(int[]arr){
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
        int[] arr = {1,2,3,5,6,17,18,4,3,2};
        int ans = peakIndex(arr);
        System.out.println(ans);
    }
}
