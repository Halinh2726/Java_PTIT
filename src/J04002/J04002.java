
package J04002;
import java.util.*;
import java.math.*;

class HinhChuNhat{
    private double dai;
    private double rong;
    private String ms;
    
    public HinhChuNhat(){
        dai = 1;
        rong = 1;
    }
    
    public HinhChuNhat(double dai, double rong, String ms){
        this.dai = dai;
        this.rong = rong;
        this.ms = ms;
    }
    
    public double getWidth(){
        return rong;
    }
    public void setWidth(double rong){
        this.rong = rong;
    }
    public double getHeigh(){
        return dai;
    }
    public void setHeigh(double dai){
        this.dai = dai;
    }
    public String getColor(){
        ms = ms.toLowerCase();
        return Character.toUpperCase(ms.charAt(0)) + ms.substring(1);
    }
    public void setColor(String ms){
        this.ms = ms;
    }
    public double findArea(){
        return dai * rong;
    }
    public double findPerimeter(){
        return (dai+rong)*2;
    }
}

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long dai = sc.nextLong();
        long rong = sc.nextLong();
        String mausac = sc.next();
        
        if(dai <= 0 || rong <= 0){
            System.out.println("INVALID");
            return;
        }
        
        HinhChuNhat r = new HinhChuNhat(dai, rong, mausac);
        System.out.printf("%.0f %.0f %s\n",r.findPerimeter(),r.findArea(),r.getColor());
        sc.close();
    } 
}
