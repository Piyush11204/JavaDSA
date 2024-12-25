package Basics;
import java.util.Scanner;

public class FunctionCall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name...");
        String Name = in.next();

        String massage = greeting(Name);
        System.out.println(massage);
    }

    
    static String greeting(String Name) {
        String greeting ="Hello " + Name;
        return greeting;
    }

}
