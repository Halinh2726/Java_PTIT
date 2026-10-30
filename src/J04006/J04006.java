package J04006;
import java.util.*;
import java.math.*;

class SinhVien{
    private String hoten;
    private String lop;
    private String ngaysinh;
    private float gpa;
    
    public SinhVien(){
        hoten = "";
        lop = "";
        ngaysinh = "";
        gpa = 0;
    }
    public String HoTen(String hoten){
        return this.hoten = hoten;
    }
    public String MaLop(String lop){
        return this.lop = lop;
    }
    public String NgaySinh(String ngaysinh){
        return this.ngaysinh = ngaysinh;
    }
    public float GPA(float gpa){
        return this.gpa = gpa;
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
    public void SinhVien(){
        String tmp = ChuanHoa(ngaysinh);
        System.out.printf("B20DCCN001 %s %s %s %.2f\n", hoten, lop, tmp, gpa);
        
    }
}
public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();
        String lop = sc.nextLine();
        String ngaysinh = sc.nextLine();
        float gpa = sc.nextFloat();
        SinhVien sv = new SinhVien();
        sv.HoTen(hoten);
        sv.MaLop(lop);
        sv.NgaySinh(ngaysinh);
        sv.GPA(gpa);
        sv.SinhVien();
        sc.close();
    }
    
}
