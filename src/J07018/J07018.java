package J07018;
import java.util.*;
import java.io.*;
import java.text.*;

class SinhVien{
    private String msv;
    private String hoten;
    private Date ngaysinh;
    private String lop;
    private double gpa;
    
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public SinhVien(int msv, String hoten, String ngaysinh, String lop, double gpa) throws ParseException{
        this.msv = String.format("B20DCCN%03d", msv);
        this.hoten = chuanHoaTen(hoten);
        this.ngaysinh = sdf.parse(ngaysinh);
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public String chuanHoaTen(String s){
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        String res = "";
        for(String x : tmp){
            res += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
        }
        return res.trim();
    }
    
    @Override
    public String toString(){
        return msv + " " + hoten + " " + lop + " " + sdf.format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}
public class J07018 {
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException{
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n = Integer.parseInt(sc.nextLine());
            
            ArrayList<SinhVien> sv = new ArrayList<>();
            
            for(int i = 1; i<= n; i++){
                String hoten = sc.nextLine();
                String lop = sc.nextLine();
                String ngaysinh = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                
                sv.add(new SinhVien(i, hoten, ngaysinh,lop,gpa));
            }
            
            for(SinhVien x : sv){
                System.out.println(x);
            }
            sc.close();
    }
}
