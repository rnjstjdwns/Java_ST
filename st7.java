public class st7 {
    enum Week {월, 화, 수, 목, 금, 토, 일}
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        String[] name = {"사과","배","오렌지", "메론"};
        
        int sum=0;

        for(int k:n) {
            sum += k;
        }
        System.out.println(sum);
    }
}
