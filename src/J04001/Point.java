/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04001;
import java.util.*;
import java.math.*;

public class Point {
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
