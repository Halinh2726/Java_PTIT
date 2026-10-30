
package J05004;
import java.util.*;
import java.text.*;


class SinhVien{
    private String msv, hoten, ngaysinh, lop;
    private double gpa;
    
    public SinhVien(){
       this.msv = "";
       this.hoten = "";
       this.ngaysinh = "";
       this.lop = "";
       this.gpa = 0;
    }
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public void nhap(Scanner sc, int stt) throws ParseException{
        msv = String.format("B20DCCN%03d", stt);
        hoten = chuanHoaTen(sc.nextLine());
        lop = sc.nextLine();
        ngaysinh = sdf.format(sdf.parse(sc.nextLine()));
        gpa = Double.parseDouble(sc.nextLine());
    }
    
    public String chuanHoaTen(String s){
        s = s.trim().toLowerCase();
        String[] a = s.split("\\s+");
        String res = "";
        
        for(String x : a){
            res += x.substring(0,1).toUpperCase() + x.substring(1) + " "; 
        }
        return res.trim();
    }
    
    @Override
    public String toString(){
        return msv +  " " + hoten + " " +lop + " " + ngaysinh + " " + String.format("%.2f\n", gpa);
    }
}

public class J05004 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        SinhVien[] sv = new SinhVien[n];
        for(int i = 0; i< n; i++){
            sv[i] = new SinhVien();
            sv[i].nhap(sc,i+1);
        }
        
        for(SinhVien s : sv){
            System.out.println(s);
        }
        sc.close();
    }
}
