package J07017;
import java.util.*;
import java.io.*;

class Pair<T,U>{
    private T first;
    private U second;
    
    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    
    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }
    public static boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        int a = (Integer) first;
        int b = (Integer) second;
        return checkPrime(a) && checkPrime(b);
    }
    @Override
    public String toString(){
        return first  + " " + second;
    }
}
public class J07017 {
    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(new File("DATA.in"));
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                boolean check = false;
                for(int i = 2; i <= 2*Math.sqrt(n); i++){
                    Pair<Integer, Integer> p = new Pair<>(i, n-i);
                    if(p.isPrime()){
                        System.out.println(p);
                        check = true;
                        break; 
                    }
                }
                if(!check) System.out.println(-1);
            }
        sc.close();
    }    
}
