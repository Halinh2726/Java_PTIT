package J05009;
import java.util.*;

class ThuKhoa implements Comparable<ThuKhoa>{
    private int mats;
    private String tents;
    private String ngaysinh;
    private double diem1, diem2, diem3;
    public double sum;
    public ThuKhoa(int mats, String tents, String ngaysinh, double diem1, double diem2, double diem3){
        this.mats = mats;
        this.tents = tents;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.sum = diem1 + diem2 + diem3;
    }
    
    @Override
    public String toString(){
        return mats + " " + tents + " " + ngaysinh + " " + String.format("%.1f", sum);
    }

    @Override
    public int compareTo(ThuKhoa o) {
        int cmp = Double.compare(o.sum, this.sum);
        if(cmp != 0) return cmp;
        return Integer.compare(this.mats,o.mats);
    }
    
    
}
public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ThuKhoa> tk = new ArrayList<>();
        for(int i = 0; i< n; i++){
            String tents = sc.nextLine();
            String ngaysinh  = sc.nextLine();
            double diem1 = sc.nextDouble();
            double diem2 = sc.nextDouble();
            double diem3 = sc.nextDouble();
            sc.nextLine();
            tk.add(new ThuKhoa(i+1, tents, ngaysinh,diem1,diem2, diem3));
        }
        
        Collections.sort(tk);
        double max = tk.get(0).sum;
        
        for(int i = 0; i< n; i++){
            if(Double.compare(tk.get(i).sum, max) == 0){
                System.out.print(tk.get(i) + "\n");
            }
            else {
                break;
            }
        }
        sc.close();
    }
    
}
