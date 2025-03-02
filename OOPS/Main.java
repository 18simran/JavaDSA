package OOPS;

public class Main {
    public static void main(String[] args) {

        Human simran = new Human(21,"simran" ,30000 ,false ) ;
        Human kanchan = new Human(21,"kanchan" ,40000 ,false ) ;
        Human pinju = new Human(21,"pinju" ,40000 ,false ) ;

        System.out.println(simran.name);
        System.out.println(kanchan.name);
        System.out.println(simran.population);
        System.out.println(kanchan.population);
        System.out.println(pinju.population);
    }
}
