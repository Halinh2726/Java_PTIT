
package J04009;
import java.util.*;
import java.math.*;

class Point{
    private double x;
    private double y;
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        double dx = x - secondPoint.x;
        double dy = y - secondPoint.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public static double distance(Point p1, Point p2){
        return p1.distance(p2);
    }
    
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            
            if(a+b <= c || a+c <= b || b+c <= a){
                System.out.println("INVALID");
            }
            else{
                double p = (a+b+c)/2;
                double s = Math.sqrt(p * (p-a) * (p-b) * (p-c));
                System.out.printf("%.2f\n", s);
            }
        }
        sc.close();
    }
}
