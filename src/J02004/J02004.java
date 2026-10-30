
package J02004;
import java.util.*;
import java.math.*;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            long[] tmp = new long[n];
            
            for(int i = 0; i< n; i++){
                tmp[i] = sc.nextLong();
            }
            
            boolean check = true;
            
            for(int i = 0; i< n/2; i++){
                if(tmp[i] != tmp[n-1-i]){
                    check = false;
                    break;
                }
            }
            
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
}
