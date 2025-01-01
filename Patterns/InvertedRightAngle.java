package Patterns;
/*


* * * * * 
* * * * 
* * * 
* * 
*  


 */
public class InvertedRightAngle {
    public static void main(String[] args) {
        Pattern(5);
    }
    static void Pattern(int n){
        // int num =1;
        for (int row = 0; row <n; row++) {
            for (int col = n; col > row; col--){
                // System.out.print(num);
                System.out.print("* ");
            }
            System.out.println();
            // num++;
        }
    }
}
