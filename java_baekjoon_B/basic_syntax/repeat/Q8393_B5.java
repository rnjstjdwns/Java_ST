package java_baekjoon_B.basic_syntax.repeat;
import java.util.*;
public class Q8393_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
