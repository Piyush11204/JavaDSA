package LEETCODE;
// Q : 1672. Richest Customer Wealth
public class MaxWalthPerson {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {5,3,5},{5,3,9}};
        System.out.println(MaxWalth(accounts));
    }

    static int MaxWalth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0 ; person < accounts.length; person++) {
            int sum=0;
            for (int account=0; account<accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
         if (ans < sum) {
            ans = sum;
         }
        }
        return ans;
    }

}
