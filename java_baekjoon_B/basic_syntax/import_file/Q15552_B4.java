package java_baekjoon_B.basic_syntax.import_file;
import java.util.*;
public class Q15552_B4 {
    // BufferdReader br = new BufferedReader(new InputStreamReader(null))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int A,B;
        int[] result = new int[T];
        for(int i=0;i<T;i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            result[i] = A+B;
        }
        for(int i=0;i<T;i++) {
            System.out.println(result[i]);
        }
    }
    
}
    // for문 문제를 풀기 전에 주의해야할 점이 있다.
    // 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때
    // 시간초과가 날 수 있다는 점이다.
    // BufferdReader와 BufferedWriter를 사용할 수 있다
    // BufferedWriter.flush