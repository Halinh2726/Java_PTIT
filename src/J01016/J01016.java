
package J01016;
import java.util.*;

public class J01016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt_4 = 0;
        int cnt_7 = 0;
        while(n > 0){
            long tmp = n % 10;
            if(tmp == 4){
                cnt_4++;
            }
            else if(tmp == 7){
                cnt_7++;
            }
            n /= 10;
        }
        long cnt = cnt_4+cnt_7;
        if(cnt == 4 || cnt == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
