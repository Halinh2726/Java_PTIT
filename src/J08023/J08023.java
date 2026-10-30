package J08023;
import java.util.*;
import java.math.*;

public class J08023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] height = new long[n];
            for(int i = 0; i< n; i++){
                height[i] = sc.nextLong();
            }
            Stack<Integer> st = new Stack<>();
            long maxArea = 0;
            for(int i = 0; i<= n; i++){
                long cur = (i == n) ? 0 : height[i];
                
                while(!st.empty() && height[st.peek()] > cur){
                    int top = st.pop();
                    long he = height[top];
                    
                    int width;
                    if(st.empty()){
                        width = i;
                    } else{
                        width = i - st.peek() - 1;
                    }
                    long area = he*width;
                    maxArea = Math.max(maxArea, area);
                }
                if(i < n){
                    st.push(i);
                }
            }
            System.out.println(maxArea);
        }
        sc.close();
    }
    
}
