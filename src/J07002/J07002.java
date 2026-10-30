package J07002;

import java.util.*;
import java.io.*;

public class J07002 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while (sc.hasNext()) {
            try {
                int n = Integer.parseInt(sc.next());
                tong += n;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(tong);
        sc.close();
    }
}
