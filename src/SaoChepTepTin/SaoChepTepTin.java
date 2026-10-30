
package SaoChepTepTin;
import java.util.*;
import java.io.*;

public class SaoChepTepTin {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("PTIT.in"));
        PrintWriter pw = new PrintWriter("PTIT.out");

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            pw.println(s);
        }

        sc.close();
        pw.close();
    }
    
}
