package Patterns;
/* 

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
*/
public class RightAngle {
    public static void main(String[] args) {
        Angle(5);
        
    }

    static void Angle(int n){
        for (int row = 0; row <= n; row++) {
            //for evey row, there is a col
            for (int col = 0;col<= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
