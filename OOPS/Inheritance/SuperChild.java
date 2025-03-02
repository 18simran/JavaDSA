package OOPS.Inheritance;

public class SuperChild extends Super {
void Show(){

    super.display();

    }
    SuperChild(){
    super();
    }

    public static void main(String[] args) {
        SuperChild sp = new SuperChild();
        sp.Show();  // Calls the display method from Parent
    }

}
