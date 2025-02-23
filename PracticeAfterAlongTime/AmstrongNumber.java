package PracticeAfterAlongTime;
import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the Number: ");
        // int n = in.nextInt();
        for (int n = 10; n < 1000; n++) {
            if (Check(n)) {
                System.out.println(n + "");
            }
        }
    }
    static boolean Check(int n){
        int original = n;
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            n = n/10;
            sum = sum + rem * rem * rem;
        }
        if (original == sum) {
            return true;
        }
        return false;
    }
}
