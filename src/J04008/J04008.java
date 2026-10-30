package J04008;
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
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        double dx = this.x - secondPoint.x;
        double dy = this.y - secondPoint.y;
        
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
public class J04008 {
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
//            
            if(a+b <= c || a+c <= b || b+c <= a){
                System.out.println("INVALID");
            } else{
                double tmp = a+b+c;
                System.out.printf("%.3f%n", tmp);
            }
        }
        sc.close();
    }
}
