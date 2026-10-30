package J05030;
import java.util.*;
import java.text.*;

class BangDiemThanhPhan implements Comparable<BangDiemThanhPhan>{
    private String msv;
    private String tensv;
    private String lop;
    private double diem1,diem2,diem3;
    
    public BangDiemThanhPhan(String msv, String tensv, String lop, double diem1, double diem2, double diem3){
        this.msv = msv;
        this.tensv = tensv;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    @Override
    public int compareTo(BangDiemThanhPhan o){
        return this.msv.compareTo(o.msv);
    }
    
     @Override
    public String toString() {
        return String.format("%s %s %s %.1f %.1f %.1f",
                msv, tensv, lop, diem1, diem2, diem3);
    }
}
public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<BangDiemThanhPhan> bdtp = new ArrayList<>();
        for(int i = 0; i< n; i++){
            String msv = sc.nextLine();
            String tensv = sc.nextLine();
            String lop = sc.nextLine();
            double diem1 = Double.parseDouble(sc.nextLine());
            double diem2 = Double.parseDouble(sc.nextLine());
            double diem3 = Double.parseDouble(sc.nextLine());
            
            bdtp.add(new BangDiemThanhPhan(msv,tensv,lop,diem1,diem2,diem3));
        }
        
        Collections.sort(bdtp);
        
        for(int i = 0; i< n; i++){
            System.out.println((i+1) + " " + bdtp.get(i));
        }
        sc.close();
    }
    
}