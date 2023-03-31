package java_baekjoon_B.Q_Tier.Silver;

import java.util.*;
import java.util.stream.Stream;
public class Q1427_S5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int[] num = new int[st.length()];
        for(int i=0;i<st.length();i++) {
            num[i] = st.charAt(i) - '0'; //매우 중요함
        }
        // int max;
        int temp=0;
        for(int i=0;i<st.length();i++) {
            // max = num[0];
            for(int j=1;j<st.length()-i;j++) {
                if(num[j] > num[j+1]) { // 1 2
                    temp = num[j];
                    // num[j] = max;
                    // num[j] = ;
                }
            }
        }
        for(int i=0;i<st.length();i++) {
            System.out.print(num[i]);
        }

        
    }
}
