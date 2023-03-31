package java_baekjoon_B;

import java.util.*;

public class Q2588_B3 {
    public static void Qanswer(int x, int y) {
        int a;
        int b;
        int hun;
        a = y%100;   
        b = a/10;
        a %= 10;
        
        hun = y/100;
        System.out.println(x*a);
        System.out.println(x*b);
        System.out.println(x*hun);
        System.out.println(x*y);
    }
    public static void main(String args[]) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        Qanswer(a,b);
    }
}
