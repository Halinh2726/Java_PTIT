package J01026;
import java.util.*;
import java.math.*;

public class J01026 {

    static boolean scp(long n){
        if(n < 2) return false;
        for(int i = 2; i *i <= n; i++){
            if(i*i == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();
      
      while(test-- > 0){
          long n = sc.nextLong();
          if(scp(n)){
              System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }
      }
      sc.close();
    }
}
