package java_baekjoon_B;
import java.util.*;
public class Q11022_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        for(int i=0;;i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            if(A == 0 && B == 0) {
                break;
            } else {
                System.out.println(A+B);
            }
            
        }
    }
}
