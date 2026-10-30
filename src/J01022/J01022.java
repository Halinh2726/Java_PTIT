package J01022;
import java.util.*;
import java.math.*;

public class J01022 {

    static long[] arr = new long[93];
    
    static char findk(int n, long k){
        if(n == 1){
            return '0';
        }
        if(n == 2){
            return '1';
        }
        
        if(k <= arr[n-2]){
            return findk(n-2,k);
        }
        else{
            return findk(n-1,k - arr[n-2]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        arr[1] = 1;
        arr[2] = 1;
        
        for(int i = 3; i< 93; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        while(test-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            char tmp = findk(n,k);
            System.out.println(tmp);
        }
    }
    
}
