import java.util.*;

public class st2 {
    public static void main(String[] args) {
        int[] a = new int[] {10,20,30,40}; //길이 생략 가능

        int[] b = {1,2,3,4,5,6,7}; //new 구문 생략 가능
        System.out.println(b.length);
        int[] c = new int[10];
        for(int i=0;i<c.length;i++) {
            c[i] = i;
        }
        System.out.println(c.length); //10
        for(int i=0;i<c.length;i++) {
            System.out.println(c[i]);
        }

        System.out.println("");
        System.out.println(Arrays.toString(c));//배열의 요소를 문자열로 바꾸어 출력
        //import java.util.Arrays; 해야함
    }
}
