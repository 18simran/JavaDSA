package OOPS.Polymorphism;

public class Main
{
    public static void main(String[] args) {
//        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Triangle tri = new Triangle();
//        Square square = new Square();
        Shapes square  = new Square() ;
//        object is of type square and reference is of type Shapes
        square.area();
    }
}
