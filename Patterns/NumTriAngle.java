package Patterns;
/*

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5  
 
 */
public class NumTriAngle {
    public static void main(String[] args) {
        NumAngle(5);
    }
    static void NumAngle(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0, num =1; col <=row; col++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
