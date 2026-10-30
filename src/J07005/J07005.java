package J07005;
import java.util.*;
import java.io.*;
import java.math.*;

public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        
        for(int i = 0; i< 100000; i++){
            int x = dis.readInt();
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> en : mp.entrySet()){
            System.out.println(en.getKey() + " " + en.getValue());
        }
        dis.close();
    }
}
