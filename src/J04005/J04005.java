package J04005;
import java.util.*;
import java.math.*;

class KhaiBao{
    private String hoten;
    private String ngaysinh;
    private double diem1, diem2, diem3;
    
    public KhaiBao(String hoten, String ngaysinh, double diem1, double diem2, double diem3){
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    private String HoTen(String hoten){
        return this.hoten = hoten;
    }
    private String NgaySinh(String ngaysinh){
        return this.ngaysinh = ngaysinh;
    }
    private String ChuanHoa(String ngaysinh){
        String[] tmp = ngaysinh.split("/");
        String ngay = tmp[0];
        String thang = tmp[1];
        String nam = tmp[2];
        
        if(ngay.length() == 1){
            ngay = '0' + ngay;
        }
        if(thang.length() == 1){
            thang = '0' + thang;
        }
        if(nam.length() == 1){
            nam = '0' + nam;
        }
        return ngay + "/" + thang + "/" + nam;
    }
    private double TongDiem(double diem1, double diem2, double diem3){
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        return diem1 + diem2 + diem3;
    }
    public void KhaiBao(String hoten, String ngaysinh, double diem1, double diem2, double diem3){
        String tmp = ChuanHoa(ngaysinh);
        double tongdiem = TongDiem(diem1, diem2, diem3);
        System.out.printf("%s %s %.1f\n", hoten, tmp, tongdiem);
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();
        String ngaysinh = sc.nextLine();
        double diem1 = sc.nextDouble();
        double diem2 = sc.nextDouble();
        double diem3 = sc.nextDouble();
        KhaiBao thisinh = new KhaiBao(hoten, ngaysinh, diem1, diem2, diem3);
        thisinh.KhaiBao(hoten, ngaysinh, diem1, diem2, diem3);
        sc.close();
    }
}
