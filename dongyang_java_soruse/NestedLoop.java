package dongyang_java_soruse;

public class NestedLoop {
    public static void main(String arg[]) {
        for(int i=1;i<10;i++) {
            for(int j=1;j<10;j++) {
                System.out.print(j+"*"+i+"="+i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
