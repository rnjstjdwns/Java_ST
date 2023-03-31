package java_baekjoon_B.basic_syntax.repeat;

import java.util.*;

public class Q2739_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        for(int i=1;i<10;i++) {
            System.out.println(N+" * "+i+" = "+N*i);
        }
    }
}
