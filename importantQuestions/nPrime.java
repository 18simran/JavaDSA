package importantQuestions;

import java.util.Arrays;

public class nPrime {
    //37 : 2,3,5,7,11,13,17,19,23,29,31,37
    static void printPrime(int n,boolean[]arr ){
        for(int i = 2 ; i * i <= n ;i++){
            if(!arr[i]){
                for(int j = i* 2 ; j <= n ;j += i){
                    arr[j] = true ;
                }
            }
        }
        for(int i = 2 ;i  <= n ;i++){
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args) {
        int n = 37 ;
        boolean [] arr = new boolean[n+1];
         printPrime(n,arr);}
}
