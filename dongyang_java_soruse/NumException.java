package dongyang_java_soruse;

public class NumException {
    public static void main(String[] args) {
        String[] stringNumber = {"23", "12", "3.141592", "998"};
        int i = 0;
        
            for(i=0;i<stringNumber.length;i++) {
                try {
                    int j = Integer.parseInt(stringNumber[i]);
                    System.out.println("숫자로 변환된 값은 "+j);
                }
                 catch(NumberFormatException e) {
                    System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
                }
        }
    }
}
