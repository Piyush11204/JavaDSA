package LEETCODE.Hybrid;
//  Q : 240. Search a 2D Matrix II
// Same in GFG ... 2 Q with same ANSWER
public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 12;
        System.out.println(SearchMatrix(matrix, target));
    }

    static boolean SearchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (target == matrix[row][col]) {
                    return true;
                }
            }
        }
        return false;
    }
}
