package java_baekjoon_B;
import java.util.*;
public class Q2884_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H,M;
        H = sc.nextInt();
        M = sc.nextInt();
        int SM = M - 45;
        if(SM < 0) {
            --H;
            SM = 60 + SM;
        }
        if(H<0) {
            H = 23;
        }
        System.out.println(H+" "+SM);
        sc.close();
    }
    
}
