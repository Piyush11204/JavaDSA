package LSA;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Piyush";
        String name1 = "Zoro";
        char target = 'u'; // this has to be declared with single quotes

        boolean finalAns = search(name1, target);
        System.out.println("Is the character " + target +  " present in "  + name1 + " " + finalAns);

        // Print the character arrays of the strings
        System.out.println("Character array of "  + name +  Arrays.toString(name.toCharArray()));
        System.out.println("Character array of "  + name1 +  Arrays.toString(name1.toCharArray()));

        // Demonstrating the swapping functionality
        String swappedString = swap(name1, 0, 2);
        if (swappedString != null) {
            System.out.println("String after swapping indices 0 and 2: " + swappedString);
        } else {
            System.out.println("Invalid indices for swapping in \"" + name1 + "\".");
        }

        // Demonstrating count functionality
        int count = countOccurrences(name, 'i');
        System.out.println("Occurrences of 'i' in \"" + name + "\": " + count);
    }


    static boolean search(String name, char target) {
        if (name == null || name.isEmpty()) {
            return false;
        }

        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

 
    static String swap(String name, int index1, int index2) {
        if (name == null || index1 < 0 || index2 < 0 || index1 >= name.length() || index2 >= name.length()) {
            return null;
        }

        char[] charArray = name.toCharArray();
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;

        return new String(charArray);
    }


    static int countOccurrences(String name, char target) {
        if (name == null || name.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (char ch : name.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }
}
