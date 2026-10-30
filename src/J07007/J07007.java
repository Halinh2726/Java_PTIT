package J07007;
import java.util.*;
import java.io.*;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            set.add(s);
        }
        for(String x : set){
            System.out.println(x);
        }
        sc.close();
    }
    
}
