package TongSoNguyen;
import java.util.*;
import java.io.*;

public class TongSoNguyen {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> arr = new ArrayList<>();

        while(sc.hasNext()) {
            String cur = sc.next();
            try{
                Integer.parseInt(cur);
            }
            catch(NumberFormatException e) {
                arr.add(cur);
            }
        }

        sc.close();
        Collections.sort(arr);

        for (String tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
