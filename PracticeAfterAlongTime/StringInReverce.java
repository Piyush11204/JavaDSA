package PracticeAfterAlongTime;

public class StringInReverce {
    public static void main(String[] args) {
        int n =12345678;
        int ans = 0;
        while (n>0) {
            int rem = n%10;
             n = n/10;
             ans = ans * 10 + rem;
        }
        System.err.println(ans);
    }
}
