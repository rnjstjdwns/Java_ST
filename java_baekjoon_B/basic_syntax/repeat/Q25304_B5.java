package java_baekjoon_B;

import java.util.*;
public class Q25304_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total,N,a,b,total_user=0;
        total = sc.nextInt();
        N = sc.nextInt();
        for(int i=0;i<N;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            total_user += a*b;
        }
        if(total_user == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
