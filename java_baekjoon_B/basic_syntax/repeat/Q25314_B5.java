package java_baekjoon_B.Bronze;

import java.util.*;


public class Q25314_B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = N/4;
        for(int i=0;i<count;i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
    // for문 문제를 풀기 전에 주의해야할 점이 있다.
    // 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때
    // 시간초과가 날 수 있다는 점이다.
    // BufferdReader와 BufferedWriter를 사용할 수 있다
    // BufferedWriter.flush
}