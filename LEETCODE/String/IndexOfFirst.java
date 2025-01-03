package LEETCODE.String;
    // Q : 28. Find the Index of the First Occurrence in a String
public class IndexOfFirst {
    public static void main(String[] args) {
        String name = "Monkey D.luffy";
        String str = "key";
        System.out.println(GetIndexOf(name, str));
    }

    static int GetIndexOf(String name,String str){
        return name.indexOf(str);
    }


}
