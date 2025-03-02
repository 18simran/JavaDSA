import java.util.Arrays;
public class pratice{
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4} ;
        int []ans = cyclic(arr) ;
        System.out.println(Arrays.toString(ans
        ));
    }
    public static int[] cyclic(int[]arr) {
       for(int i = 0 ;i < arr.length-1 ;i++)
       {
         int pos = arr[i] - 1 ;
         if(arr[i] != arr[pos])
         {
             swap(arr,arr[pos],arr[i]);
         }
         else{
             break;
       }
       }
       return arr ;
    }
    public static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}
