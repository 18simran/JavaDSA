package Programs;
public class Question3 {
	//Find missing number from the given array
// {1,2,4,6,5,7,8,9}
 public static void findMissing(int arr[], int N)
 {
     int i;
     int temp[] = new int[N + 1];

     for (i = 0; i < N; i++)
     {
         temp[arr[i] - 1] = 1;
     }
     int ans = 0;
     for (i = 0; i <= N; i++)
     {
         if (temp[i] == 0)
             ans = i + 1;
        
     }
     System.out.println("The missing number is : " + ans);
 }
 public static void main(String[] args)
 {
     int arr[] = {1,2,4,6,5,7,8,9};
     int n = arr.length;

     findMissing(arr, n);
 }
}
