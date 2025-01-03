package Patterns;

public class Dimond {
    public static void main(String[] args) {
        Patter(5);
    }
    static void Patter(int n){
        for (int row = 0; row < 2* n; row++) {
            int StarsInCol = row > n ? 2 * n -row : row;
            int space = n - StarsInCol;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");   // Play here and change the sapes
            }

            for (int col = 0; col < StarsInCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
