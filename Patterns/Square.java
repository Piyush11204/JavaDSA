package Patterns;
/*
 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

 */
public class Square {
    public static void main(String[] args) {
        SquarePattern(5);
    }  
    static void SquarePattern(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
