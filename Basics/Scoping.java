package Basics;
public class Scoping {
    public static void main(String[] args) {
        int a =12;
    
        {
            a= 99;
            int c =45;
            System.out.println("c:"+c);
            System.out.println("a:"+a);
        }
        int c =30;
        System.out.println("a:"+a);
        System.out.println("c:"+c);
    }
}
