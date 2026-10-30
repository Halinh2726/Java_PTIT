package J08026;
import java.util.*;
import java.math.*;

public class J08026 {
    public static int bfs(int s, int t){
        if(s >= t) return s-t;
        
        Queue<Integer> q = new LinkedList<>();
        
        boolean[] visited = new boolean[20001];
        int[] dist = new int[20001];
        
        q.offer(s);
        visited[s] = true;
        
        while(!q.isEmpty()){
            int x = q.poll();
            
            if(x == t){
                return dist[x];
            }
            int a = x-1;
            int b = x*2;
            
            if(a >= 0 && !visited[a]){
                visited[a] = true;
                dist[a] = dist[x] +1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            
        }
    }
    
}
