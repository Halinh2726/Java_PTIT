/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J04003;
import java.util.*;
import java.math.*;

class ToiGian{
    private long tu, mau;
    
    public ToiGian(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    private long gcd(long a, long b){
        while(b != 0){
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public void ToiGian(long tu, long mau){
        long ucln = gcd(tu, mau);
        tu /= ucln;
        mau /= ucln;
        
        System.out.println(tu + "/" + mau);
    }
}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        
        ToiGian tg = new ToiGian(tu, mau);
        tg.ToiGian(tu, mau);
        sc.close();
    }
}
