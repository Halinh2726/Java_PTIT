package J08010;
import java.util.*;
import java.io.*;

public class J08010 {
    public static boolean isPalindrome(String s){
        int l = 0, r = s.length() - 1;
        while(l <r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        int maxlen = 0;
        while(sc.hasNext()){
            String s = sc.next();
            
            if(isPalindrome(s)){
                mp.put(s,mp.getOrDefault(s, 0) + 1);
                maxlen = Math.max(maxlen, s.length());
            }
        }
        
        for(Map.Entry<String, Integer> entry : mp.entrySet()){
            if(entry.getKey().length() == maxlen){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        sc.close();
    }
}
