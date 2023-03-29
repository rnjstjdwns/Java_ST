package dongyang_java_soruse;
import java.util.*;
public class BreakExample {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료합니다.");
        while(true) {
            System.out.print(">>");
            String text = sc.nextLine();
            if(text.equals("exit"))
                break;
        }
        System.out.println("종료합니다...");
        sc.close();
    }
}
