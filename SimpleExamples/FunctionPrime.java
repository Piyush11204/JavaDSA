package SimpleExamples;
import java.util.Scanner;
public class FunctionPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        boolean ans = Prime(num);
        System.out.println(ans);
        
    }
    static  boolean Prime(int num){
        if(num<=1){
            return false;
        }
        int c =2;
        while (c*c <=num) {

            if(num % c == 0){
                return false;
            }
            c++;
        }
        if(c*c > num){
            return true;
        }
        return false;

    }
}
