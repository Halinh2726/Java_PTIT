package J01035;

import java.util.*;

public class J01035 {
    private static long[] pow10 = new long[15];

    static {
        pow10[0] = 1;
        for (int i = 1; i < 15; ++i) {
            pow10[i] = pow10[i - 1] * 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-- > 0) {
            String a = sc.next(), b = sc.next();
            long total = 0;
            int cntUnknown = 0;
            for (int i = 0; i < a.length(); ++i) {
                if(a.charAt(i) == '?') {
                    ++cntUnknown;
                }
            }

            for (int i = 0; i < a.length(); ++i) {
                char charA = a.charAt(i);
                char charB = b.charAt(i);

                if(charA == '?') {
                    --cntUnknown;
                    int way = 9 - (charB - '0');
                    total += pow10[cntUnknown] * way;
                }
                else {
                    if(charA > charB) {
                        total += pow10[cntUnknown];
                        break;
                    }
                    else if(charA < charB) {
                        break;
                    }
                }
            }

            System.out.println(total);
        }
    }
}