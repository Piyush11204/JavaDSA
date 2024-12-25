package Basics;
import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

    System.out.println("Ask about any fruit:");
        String fruit = in.next();

        
    // better way of using Switch case with out using of break condition...
        switch(fruit){
            case "mango" -> System.out.println("King of fruits");
            case "apple"->System.out.println("I am that red one people talk about");
            case "banana"->System.out.println("You sure Apple...");
            case "cat"->System.out.println("I am not even a fruit why i am here.. ? Meowwww");   
            default->System.out.println("Read the Question Dumnass...");
        }

        // int day = in.nextInt();

        // switch(day){
        //     case 1,2,3,4,5-> System.out.println("Fuck offff");
        //     case 6,7-> System.out.println("hehehehehehe");
        // }

    }
}