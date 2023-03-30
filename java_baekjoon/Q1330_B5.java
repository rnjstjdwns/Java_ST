package java_baekjoon;
import java.util.*;
public class Q1330_B5 {
    public static void main(String args[]) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b) {
            System.out.println(">");
        } else if(a<b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
