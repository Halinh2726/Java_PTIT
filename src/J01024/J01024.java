
package J01024;
import java.util.*;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String s = sc.next();
            boolean ok = true;
            for(char x : s.toCharArray()){
                if(x != '0' && x != '1' && x != '2'){
                    ok = false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
