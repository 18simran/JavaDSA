package arrays;

public class stringPangrim {
    static boolean isPangrim(String str) {
        String lstr = str.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (char letter : alphabet.toCharArray() ) {
            if (lstr.indexOf(letter) == -1) {
                return false;
            }

        }
        return true;
    }

        public static void main (String[]args){
            String str = "thequickbrownfoxjumpsoverthelazydog";

            boolean ans = isPangrim(str);
            System.out.println(ans);
        }
    }