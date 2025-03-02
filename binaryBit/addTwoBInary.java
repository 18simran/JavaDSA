package binaryBit;

public class addTwoBInary {
    public static void main(String[]args) {
        String a = "11" ;
        String b = "1" ;
        int sum = Integer.parseInt(a,2) + Integer.parseInt(b,2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(sum));
    }
}
