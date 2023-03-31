package java_baekjoon_B;

import java.util.Scanner;

public class Q2438_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//for문 실행 순서 => 초기값 - 조건식 - 실행문 - 증감식 - 조건식 - 실행문 - 반복