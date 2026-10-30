
package J01018;
import java.util.*;
import java.math.*;

public class J01018 {
    public static boolean check(String s){
        int ce = 0;
        long sum = 0;
        for(int i = 0; i< s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        for(int i = 0; i < s.length()-1; i++){
            int a = s.charAt(i) - '0';
            int b = s.charAt(i+1) - '0';

            if(Math.abs(a-b) != 2){
                ce = 1;
                break;
            }
        }
        
        if(ce == 1){
            return false;
        }
        else if(sum % 10 != 0){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            String n = sc.next();
            if(check(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
