package J01033;
import java.util.*;
import java.math.*;

public class J01033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        
        while(t-- > 0){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            
            System.out.println(x.divide(x.gcd(y)).multiply(y));
        }
        sc.close();
    }    
}
