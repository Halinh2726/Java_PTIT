
package J01021;
import java.util.*;

public class J01021 {
    static long MOD = 1000000007;
    static void luythua(long a, long b){
        long tmp = 1;
        a %= MOD;
        
        while(b>0){
            if(b % 2 == 1){
                tmp = (tmp*a)%MOD;
            }
            
            a = (a*a)%MOD;
            b/= 2;
        }
        
        System.out.println(tmp);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if(a == 0 && b == 0){
               break; 
            }
            luythua(a,b);
        }
        sc.close();
    }
}
