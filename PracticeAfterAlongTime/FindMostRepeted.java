package PracticeAfterAlongTime;

public class FindMostRepeted {
    public static void main(String[] args) {
        int n = 318515356;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
             n = n/10;
            if (rem == 5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
