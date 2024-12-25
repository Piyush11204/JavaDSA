package SimpleExamples;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = in.nextInt();
        // System.out.println(ArmstrongNumber(n));

        for(int i = 10; i < 1000 ; i++){
            if(ArmstrongNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean ArmstrongNumber(int n){
        int original = n;
        int sum = 0;
        while (n>0) {
            int rem = n% 10;
            n = n/10;
            sum = sum + rem * rem * rem; 
        }
        if( original == sum){
            return true;
        }
        return false;
    }
}
