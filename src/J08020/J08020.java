package J08020;
import java.util.*;
import java.math.*;

public class J08020 {
    public static boolean check(String s){
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else{
                if(st.empty()) return false;
                
                char top = st.pop();
                if(c == ')' && top != '(') return false;
                if(c == '[' && top != ']') return false;
                if(c == '{' && top != '}') return false;
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t--  > 0){
            
            String s = sc.next();
            System.out.println(check(s) ? "YES" : "NO");
        }
        sc.close();
    }
}
