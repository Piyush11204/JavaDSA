package SimpleExamples;
public class CountFromString {
    public static void main(String[] args) {
        int n = 834622390;
        int count = 0;
        while (n>0) {
            int rem = n% 10;
            if(rem ==2){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}