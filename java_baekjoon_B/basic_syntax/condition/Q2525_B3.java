package java_baekjoon_B.basic_syntax.condition;

import java.util.*;

public class Q2525_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NowH;
        int NowM;
        int clock;
        NowH = sc.nextInt();
        NowM = sc.nextInt();
        clock = sc.nextInt();
        NowM += clock;
        while(true) {
            if(NowM >= 60) {
                ++NowH;
                NowM -= 60;
            }
            if(NowH > 23) {
                NowH = 0;
            } 
            if(NowM < 60) {
                break;
            }
        }
        
        
        System.out.println(NowH+" "+NowM);
                
    }
}
