package OOPS;

public class StaticBlock {
    static int a = 6 ;
    static int b ;
    //static will run only once , when the object is created i.e. when the class is loaded for first time
    static {
        System.out.println("I am in static block.");
        b = a * 5 ;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock() ;
        System.out.println(StaticBlock.a + " " +StaticBlock.b);
StaticBlock.b += 3 ;
        System.out.println(StaticBlock.a + " " +StaticBlock.b);
        StaticBlock obj2 = new StaticBlock() ;
        System.out.println(StaticBlock.a + " " +StaticBlock.b);
    }
}
