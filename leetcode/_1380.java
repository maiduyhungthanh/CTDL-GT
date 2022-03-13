import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1380 {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> kq = new ArrayList<>();
        List<Integer> kk = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            kq.add(matrix[i][0]);
        }
        kq.sort((o1, o2) -> o2 - o1);
        int x = kq.get(0);
        int y = 0;
        kq.clear();
        kq.add(x);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(x == matrix[i][j]){
                    y = j;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            kk.add(matrix[i][3]);
        }
        kk.sort((o1, o2) -> o2 - o1);
        if (kk.get(0) == x){
        return kq; }
        return kk;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }
}
