package OOPS.Inheritance;
class MultipleIn1
{
    int n = 5 ;
}
class MultipleIn2 extends MultipleIn1
{
    int n = 10 ;
}
public class MultipleIn extends MultipleIn2
{
    //not supported in java
    public static void main(String[] args)
     {
         MultipleIn1 obj = new MultipleIn1();
         System.out.println(obj.n);
     }
}
