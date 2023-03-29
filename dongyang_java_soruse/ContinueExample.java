package dongyang_java_soruse;

import java.util.*;
public class ContinueExample {
    public static void main(String arg[]) {
        System.out.println("정수를 5개를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<5;i++) {
            int n = sc.nextInt();
            if(n <= 0)
                continue;
            else
                sum += n;
        }
        System.out.println("양수의 합은"+sum);
        sc.close();
    }
}
