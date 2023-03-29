import java.util.*;

public class st5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {0,0,0,0,0,0};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.arraycopy(a, 1, b, 2, 4);
        System.out.println(Arrays.toString(b));
    }    
}
