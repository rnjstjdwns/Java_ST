package dongyang_java_soruse;

import java.util.*;
public class WhileSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int n;
        System.out.print("정수를 여러개 입력하시고 마지막에 -1을 넣어주세요");
        while(true) {
            n = sc.nextInt();
            if(n==-1) {
                System.out.println("정수의 개수는 "+count+"평균 값은"+(double)sum/count);
                break;
            }
            sum += n;
            
            
            ++count;
        }
        sc.close();
    
    }
}
