
package J04001;
import java.util.*;
class Point {
    double x,y,x1,y1;
    public Point(double x, double y, double x1, double y1){
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
    public void TinhKc(){
        double kc = Math.sqrt(Math.abs(x1-x) * Math.abs(x1-x) + Math.abs(y1-y) * Math.abs(y1-y));
        // String kc = String.format("%.4f", args)
        System.out.printf("%.4f\n", kc);
   }
}
public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            
            Point khoangcach = new Point(x,y,x1,y1);
            khoangcach.TinhKc();
        }
        sc.close();
    }
    
}
