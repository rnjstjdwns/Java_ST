package dongyang_java_soruse;
import java.util.*;
public class StarDot {
    public static void ForStarPrint(int n) {
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void WhileStarPrint(int n) {
        while(true) {
            int i = 0;
            int j = 0;
            if(j < n-i) {
                System.out.print("*");
                j++;
            }
            else {
                break;
            }
            System.out.println();
            i++;
        }
    }

    public static void DoWhileStarPrint(int n) {
        System.out.println("공사중...");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별을 출력할 줄의 개수를 지정해주세요(정수 1개) : ");
        int n = 0;
        n = sc.nextInt();
        ForStarPrint(n);
        WhileStarPrint(n);
        DoWhileStarPrint(n);
        sc.close();
    }
}
