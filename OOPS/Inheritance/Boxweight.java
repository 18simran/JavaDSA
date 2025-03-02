package OOPS.Inheritance;

public class Boxweight extends Box {
    double weight ;
    public Boxweight() {
        this.weight = 99.02 ;
    }
    public Boxweight(double l , double h , double w , double weight){
        super(l,h,w) ;//call the parent class constructor
        //used to initialize values in parent class
        this.weight = weight;
    }
}
