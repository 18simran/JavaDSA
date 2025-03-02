package dsa_patterns;

public class pattern_four {
    public static void main(String[] args){
        int n = 4;
        for(int i = 1; i<=n ; i++){
            for(int j = i;j <= n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        ****
//        ***
//        **
//        *
