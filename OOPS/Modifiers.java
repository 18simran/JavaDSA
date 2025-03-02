package OOPS;

import java.lang.reflect.Modifier;

class Example {
    void hello() {

        System.out.println("hello");
    }
}
public class Modifiers extends Example
{
    private int num ;
    String name ;
    int[] arr ;
    @Override
    public int hashCode()
    {
        return  super.hashCode();
    }
    @Override
    public  boolean equals(Object obj)
    {
        return super.equals(obj) ;

    }
    void hello()
    {
        System.out.println("hii");
    }

    public int getNum()
    {
        return num ;
    }
    public Modifiers(int num,String name ,int[] arr)
    {
        this.num = num ;
        this.name = name ;
        this.arr = arr ;
    }


    public static void main(String[] args) {
        int arr[] = {5,7,8};
        Modifiers obj = new Modifiers(15,"smaeyra",arr);
        Modifiers obj2 = new Modifiers(15,"smaeyra",arr);
      if(obj.equals(obj2)) //checking contents
    {
    System.out.println("obj is less than obj2");
    }
        if(obj == obj2)
        {
            System.out.println("obj is less than obj2");
        }
        System.out.println(obj.getClass());
        obj.hello();
        System.out.println(obj.hashCode());
    }
}
