package java_baekjoon_B.basic_syntax.string;

import java.util.*;
public class Q10809_B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int flag=0;
        for(int i=0;i<26;i++) {
            for(int j=0;j<S.length();j++) {
                if((int)S.charAt(j) == i+97) {
                    System.out.print(j+" ");
                    flag = 1;

                }
            }
            if(flag == 0) {
                System.out.print("-1 ");
            }
        }  
    }
}

//.length() 매우 중요!!
