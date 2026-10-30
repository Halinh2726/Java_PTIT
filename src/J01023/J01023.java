package j01023;

import java.util.Scanner;

public class J01023 {

    static private boolean ok;
    static private char[] s;
    static private char[] c = {'+' , '-', '*', '/'};
    static private String tmp;
    
    private static boolean Check(){
        int a = (int)(s[0] - '0') * 10 + (int)(s[1] - '0');
        int b = (int)(s[5] - '0')*10 + (int)(s[6] - '0');
        int c = (int)(s[10] - '0')*10 + (int)(s[11] - '0');
        
        if(s[3] == '+') return a+b == c;
        else if(s[3] == '-') return a-b == c;
        else if(s[3] == '*') return a*b == c;
        else{
            if(a%b != 0) return false;
            return a/b == c;
        }
    }
    
    private static void Try(int pos){
        if(ok) return;
        
        if(pos == tmp.length()){
            if(Check()){
               for(int i = 0; i< tmp.length(); i++){
                   System.out.print(s[i]);
               }
               System.out.println();
               ok = true;
            }
            return;
        }
        
        if(s[pos] != '?' ) Try(pos + 1);
        
        else if(pos == 3){
            for(int i = 0; i< 4; i++){
                s[pos] = c[i];
                Try(pos+1);
                s[pos] = '?';
            }
        }
        else {
            for(int i = 0; i<= 9; i++){
                if(i == 0 && (pos == 0 || pos == 5 || pos == 10)) continue;
                s[pos] = (char)(i + '0');
                Try(pos +1);
                s[pos] = '?';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();

        while(test-- > 0) {
            ok = false;
            tmp = sc.nextLine();
            s = tmp.toCharArray();
            Try(0);

            if(!ok) System.out.println("WRONG PROBLEM!");
        }

        sc.close();
    }
}