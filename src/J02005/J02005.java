package J02005;

import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        for (int x : a) {
            if (b.contains(x)) {
                System.out.print(x + " ");
            }
        }

        sc.close();
    }
}