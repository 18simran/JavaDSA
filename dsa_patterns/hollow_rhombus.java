package dsa_patterns;

public class hollow_rhombus {
    public static void main(String[] args){
        int r = 5 ;
        int c = 8 ;
        for(int i = 1 ; i <= r ; i++){
            for(int j = i ; j <= r  ;j++) {
                System.out.print(" ");
            }
                        for(int j = 1 ;j<=r;j++){
                            if(j == 1||i == 1||i == r||j == r ){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                        }
            }
            System.out.println();
        }
    }

}

