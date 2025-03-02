package OOPS.Inheritance;
import OOPS.Modifiers;
public class Box {
    private double l; //we can use l only in this file can't use it outside
    double h ;
    double w ;


    Box(){
        this.l = -1 ;
        this.w = -1 ;
        this.h = -1 ;
    }
    //cube
    Box(double side){
        this.l  = side ;
        this.h = side ;
        this.w = side ;
    }
    //box2
    Box(double h , double w , double l) {
        this.l = l ;
        this.w =w ;
        this.h = h ;
    }
    //box3
    Box (Box old ) {
        this.l = old.l ;
        this.w =old.w;
        this.h = old.h; ;
    }
   public void display(){
        System.out.println("Running the box");
    }

    public static void main(String[] args) {
        Box box = new Box() ;
        Box cube = new Box(3.5);
        Box box2 = new Box(2.5,3.25,4.56);
        Box box3 = new Box(box);
        Boxweight box4  = new Boxweight() ;
        System.out.println(box.l + " " + box.h + " " + box.w);
        System.out.println(cube.l + " " + cube.h + " " + cube.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);
        System.out.println(box3.l + " " + box3.h + " " + " " + box3.w );
        System.out.println(box4.h + " " + box4.weight );
        int arr[] ={3,5,2};

    }
}