package dongyang_java_soruse;

public class DoWhileSample {
    public static void main(String[] args) {
        char c = 'A';
        do {
            System.out.print(c);
            c = (char)(c+1);
        }while(c <= 'Q');
    }
}
