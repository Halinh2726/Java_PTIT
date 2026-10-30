/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TinhTong;
import java.util.*;
import java.io.*;

public class TinhTong {

     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));

        long total = 0;
        while(sc.hasNext()) {
            String cur = sc.next();
            try{
                Integer.parseInt(cur);
            }
            catch(NumberFormatException e) {
                try {
                    long tmp = Long.parseLong(cur);
                    total += tmp;
                }
                catch(NumberFormatException e2) {

                }
            }
        }

        sc.close();
        System.out.print(total);
    }
    
}
