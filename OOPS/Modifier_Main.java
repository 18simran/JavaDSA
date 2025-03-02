package OOPS;

public class Modifier_Main   {
    public static void main(String[] args) {
        int arr[] = {3,5,8};

        Modifiers obj = new Modifiers(10,"simran", arr) ;
//        obj.num ; num is private that's why we can't access  it .
        int n =   obj.getNum() ;
        System.out.println(n);
        String name = obj.name ;
        System.out.println(name);
    }
}
