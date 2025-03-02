package binaryBit;

public class findithBit {
    public static void main(String[]args) {
       int n = 5 ;
       int pos = 3 ;
       int mask = n << pos ;
       if((n & mask) == 0){
           System.out.println("0");
       }
       else{
           System.out.println("1");
       }
    }
}
