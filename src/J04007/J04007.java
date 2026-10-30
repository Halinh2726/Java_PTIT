
package J04007;
import java.util.*;
import java.text.*;

class NhanVien{
    private String manv;
    private String hoten;
    private String gioitinh;
    private Date ngaysinh;
    private String diachi;
    private String mst;
    private Date ngayki;
    
    public NhanVien(String hoten, String gioitinh, String ngaysinh, String diachi, String mst, String ngayki) throws ParseException{
        this.manv = "00001";
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.mst = mst;
        this.ngayki = new SimpleDateFormat("dd/MM/yyyy").parse(ngayki);
    } 
    
    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
         return manv + " "
                + hoten + " "
                + gioitinh + " "
                + sdf.format(ngaysinh) + " "
                + diachi + " "
                + mst + " "
                + sdf.format(ngayki);
    }
}
public class J04007 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();
        String gioitinh = sc.nextLine();
        String ngaysinh = sc.nextLine();
        String diachi = sc.nextLine();
        String mst = sc.nextLine();
        String ngayki = sc.nextLine();
        
        NhanVien nv = new NhanVien(hoten, gioitinh,ngaysinh,diachi, mst, ngayki);
         System.out.println(nv);
        sc.close();
    }
}
