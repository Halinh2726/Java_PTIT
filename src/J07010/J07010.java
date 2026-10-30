package J07010;
import java.util.*;
import java.io.*;
import java.text.*;

class Student{
    private String id;
    private String name;
    private String className;
    private double gpa;
    private Date dob;
    
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Student(int id, String name, String className, String dob, double gpa) throws ParseException{
        this.id = String.format("B20DCCN%03d", id);
        this.name = name;
        this.className = className;
        this.dob = sdf.parse(dob);
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + className + " "+ sdf.format(dob) + " " + String.format("%.2f", gpa);
    }
}
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        
        for(int i = 1; i<= n; i++){
            String name = sc.nextLine();
            String className = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine().trim());
            
            Student student = new Student(i, name, className, dob, gpa);
            System.out.println(student);
        }
        sc.close();
    }
}
