import java.util.*;
import java.util.Queue;

//implement stack using Queues
public class SingleLL {
    public static double  median(int[] nums1,int[] nums2) {
        int[]mergedArr = new int[nums1.length +nums2.length] ;
        for (int i = 0 ; i < nums1.length;i++){
            mergedArr[i] = nums1[i] ;
        }
        int k = nums1.length ;
        for (int j = 0;j < nums2.length  ;j++)
        {
            mergedArr[k] = nums2[j] ;
            k++ ;
        }
         Arrays.sort(mergedArr);
        //for odd ones
        if(mergedArr.length%2 !=0)
        {
            int s = 0 ; int e = mergedArr.length -1;
            return s + (e-s)/2;
        }
        else{
              int a = (mergedArr.length) / 2;
              int b = a- 1 ;
              return ( mergedArr[a] + mergedArr[b] )/2 ;
        }
    }
    public static void main(String[] args)
    {
     int [] nums1 = {1,2};
     int [] nums2 = {3,4} ;
     double ans = median(nums1,nums2);
     System.out.println(ans);
    }
}