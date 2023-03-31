package java_baekjoon_B.Bronze.import_file;
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
