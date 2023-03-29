public class st4 {
    public static void main(String[] args) {
        int[][] student = {
            {100,200,300},
            {400,500,600},
            {700,800,900},
            {200,400,500}
        };
        for(int i=0;i<student.length;i++) {
            for(int j = 0;j<3;j++) {
                System.out.print(student[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
