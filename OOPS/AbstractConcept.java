package OOPS;

 abstract class Color
{
    final int a = 50 ;
     final void Pink()
     {
         System.out.println("final method in abstract class ");
     }
     final static void Blue()
     {
         System.out.println("final static method in abstract class ");
     }

    static void good()
    {
        System.out.println("having a good day");
    }
//    abstract static void good()
//    {
//not possible as abstract methods need objects to call and static doesn't so they both can't be combined .
//    }
     Color()
    {
        System.out.println("hii");
    }
    abstract void Details(String name,int id) ;

}
abstract class Flower extends Color
{
    abstract void FName(String name ,int num) ;

}
public class AbstractConcept extends Flower
{
    void FName(String name ,int num)
    {

        System.out.println("There are " + num + " flowers of " +name);

    }
    void Details(String name ,int id)
    {

        System.out.println(name + " " + id);
    }
    public static void main(String[] args)
    {
        AbstractConcept obj = new AbstractConcept();
        obj.Details("simran",10);
        obj.FName("lily",100);
        Color.good();
      obj.Pink();
//      obj.a = 15 ; we can't modify final variable
        System.out.println(obj.a);
//        Flower f = new Flower() ; we can't create objects of abstract classes.
        Color.Blue();
    }
}
