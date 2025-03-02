package arrays;
public class strings_program {
    public static void main(String[] args) {
       String s = "x" ;
       int ans = lastWordLength(s) ;
        System.out.println(ans);
    }
    private static int lastWordLength(String s) {
       char ch = ' ' ;
       int x = 0 ; boolean val = false ;
        for (int i = s.length()- 1 ; i >= 0 ;i--)
        {
            char c = s.charAt(i) ;
          if(c == ch)
          {
                if(val) return x ;
          }else {
              x++ ;
              val = true ;
          }
        }
        return x ;
    }
}
