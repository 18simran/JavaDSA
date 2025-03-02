package OOPS.Polymorphism;

class Pink
{
//  final   void color() we can't override final methods
   static   void greeting()
    {
        System.out.println("hello");
    }
    void color()
    {
        System.out.println("Its pink color ");
    }

}
class Purple extends Pink{
@Override
    void color()
    {
        System.out.println("Its purple color ");
    }
    static void greeting()
    {
        System.out.println("hii");
    }
}
public class Overriding
{

    public static void main(String[] args) {
        Purple obj = new Purple();
        obj.color();
        Pink.greeting();
    }
}
