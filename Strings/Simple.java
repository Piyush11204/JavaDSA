package Strings;

// NOTE : STRINGS ARE IMMUTABLE IN JAVA...
// Why it is immutable :- For security reasons , ex: if someone with same name change the name everyones name will change 
public class Simple {
    public static void main(String[] args) {
        String name = "ZoroLost";
        String name1 = "ZoroLost";

        String name2 = new String("ZoroLostAgaing");
        String name3 = new String("ZoroLostAgaing");

        // Pointing to same value
        System.out.println(name == name1);

        // Creating New Value for each
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));

        // Find an Index in String
        System.out.println(name.charAt(0));
        // More 
        System.out.println(name.length());  
        System.out.println(name.substring(0, 4)); 
        System.out.println(name3.indexOf(name1)); 

    }
}
