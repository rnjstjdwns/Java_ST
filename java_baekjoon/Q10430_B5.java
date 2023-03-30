package java_baekjoon;

import java.util.*;

public class Q10430_B5 {

    public static void Qanswer(int x, int y, int z) {
        System.out.println((x+y)%z);
        System.out.println(((x%z)+(y%z))%z);
        System.out.println((x*y)%z);
        System.out.println(((x%z)*(y%z))%z);
    }
    public static void main(String args[]) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        Qanswer(a,b,c);
    }
}
