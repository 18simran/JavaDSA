import java.util.Arrays;

public class practice
{
    public static boolean isPowerOfFour(int n) {
        if(n == 1)
        {
            return true ;
        }
        for(int i = 1 ;i < n; i++){
            if(n == Math.pow(4, i))
            {
                return true;
            }
        }
        return false ;
    }
    public static void main(String[] args)
    {
     int n = 1;
     boolean ans = isPowerOfFour(n) ;
        System.out.println(ans);
    }
}