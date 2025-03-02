package importantQuestions;

public class isPrime {
    static boolean checkPrime(int n){
        if(n <= 1 ){
            return false ;
        }
        // we are checking till root n coz after that it starts checking again
        for(int i = 2 ; i * i  <= n ;i++ ){
            if(n % i == 0){
                return false ;
            }
        }
      return true ;
    }
    public static void main(String[] args) {
        int n = 29 ;
        boolean ans = checkPrime(n);
        System.out.println(ans);
    }
}