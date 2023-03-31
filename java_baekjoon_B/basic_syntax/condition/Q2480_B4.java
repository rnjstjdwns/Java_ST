package java_baekjoon_B.basic_syntax.condition;

import java.util.*;

public class Q2480_B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] d = new int[3]; 
        int money;
        int max=0;
        d[0] = sc.nextInt();
        d[1] = sc.nextInt();
        d[2] = sc.nextInt();
        if(d[0] == d[1] && d[0] == d[2]) {
            money= 10000+d[0]*1000;
        }
        else if(d[0] == d[1]) {
            money = 1000+d[0]*100;
        } else if(d[0]==d[2]) {
            money = 1000+d[0]*100;
        } else if(d[1]==d[2]) {
            money = 1000+d[1]*100;
        } else {
            for(int i=0;i<3;i++) {
                if(max < d[i]) {
                    max = d[i];
                }
            }
            money = max*100;
        }
        System.out.println(money);
    }
}