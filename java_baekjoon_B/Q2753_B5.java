package java_baekjoon_B;
import java.util.*;

public class Q2753_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        if(year%400==0) {
            System.out.println('1');
        } else if(year%4==0 && year%100 != 0) {
            System.out.println('1');
        } else {
            System.out.println('0');
        }
    }    
}
