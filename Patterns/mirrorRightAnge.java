package Patterns;
 /*


*    
*    *    
*    *    *    
*    *    *    *    
*    *    *    *    *    
*    *    *    *    
*    *    *    
*    *    
*    


  */
public class mirrorRightAnge {
    public static void main(String[] args) {
        Pattern(5);
    }
    static void Pattern(int n){
        for (int row = 1; row < n * 2; row++) {
            int TotalRows = row > n ? 2 * n - row : row;
            for (int col = 0; col <TotalRows; col++) {
                System.out.print("*    ");
            }
            System.out.println();
        }
    }
}
