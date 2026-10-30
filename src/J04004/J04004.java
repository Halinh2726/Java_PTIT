package J04004;
import java.util.*;
import java.math.*;

class TongPhanSo{
    private long tu;
    private long mau;
    
    public TongPhanSo(long tu1, long mau1, long tu2, long mau2){
        this.tu = tu1;
        this.mau = mau1;
        this.tu = tu2;
        this.mau = mau2;
    }
    public long gcd(long tu, long mau){
        while(mau != 0){
            long tmp = tu % mau;
            tu = mau;
            mau = tmp;
        }
        return tu;
    }
    public void TongPhanSo(long tu1,long mau1, long tu2, long mau2){
        long a = tu1*mau2 + tu2*mau1;
        long b = mau1*mau2;
        long ucln = gcd(a, b);
        a /= ucln;
        b /= ucln;
        
        System.out.println(a + "/" + b);
    }
}
public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        
        TongPhanSo tps = new TongPhanSo(tu1, mau1, tu2, mau2);
        tps.TongPhanSo(tu1, mau1, tu2, mau2);
        sc.close();
    }
}
