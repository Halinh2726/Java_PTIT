package J07025;
import java.util.*;
import java.io.*;
import java.text.*;

class KhachHang implements Comparable<KhachHang>{
    private String maKH;
    private String tenKH;
    private String gioitinh;
    private Date dob;
    private String addr;
    
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public KhachHang(int maKH, String tenKH, String gioitinh, String dob, String addr) throws ParseException{
        this.maKH = String.format("KH%03d", maKH);
        this.tenKH = chuanHoaTen(tenKH);
        this.gioitinh = gioitinh;
        this.dob = sdf.parse(dob);
        this.addr = addr;
    }
    
    public String chuanHoaTen(String s){
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        String res = "";
        
        for(String x:tmp){
            res += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
        }
        return res.trim();
    }
    
    @Override
    public int compareTo(KhachHang c){
        return this.dob.compareTo(c.dob);
    }
    
    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + gioitinh + " " + addr + " " + sdf.format(dob);
    }
}
public class J07025 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        
        for(int i = 1; i<= n; i++){
            String tenKH = sc.nextLine();
            String gioitinh = sc.nextLine();
            String dob = sc.nextLine();
            String addr = sc.nextLine();
            
            ds.add(new  KhachHang(i,tenKH, gioitinh, dob, addr));
        }
        Collections.sort(ds);
        
        for(KhachHang kh:ds){
            System.out.println(kh);
        }
        sc.close();
    }
}
