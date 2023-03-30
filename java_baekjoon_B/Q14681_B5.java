package java_baekjoon_B;
import java.util.*;
public class Q14681_B5 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>0 && y>0) {
            System.out.println(1);
        } else if(x<0 && y>0) {
            System.out.println(2);
        } else if(x<0 && y<0) {
            System.out.println(3);
        } else if(x>0 && y<0) {
            System.out.println(4);
        }
    }
}

