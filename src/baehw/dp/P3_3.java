package baehw.dp;

import java.util.Arrays;
import java.util.Scanner;

//동전
public class P3_3 {

    static int solution(int k, int[] coins){
        int[] dp = new int[k+1];
        Arrays.fill(dp, Integer.MAX_VALUE-1);

        for (int x : coins) {
            if (x <= k) {
                dp[x] = 1;
            }
        }

        for(int coin : coins){
            for(int i = coin; i <= k; i++){
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int[] coins = {1, 4, 7, 13, 28, 52, 91, 365};
        System.out.println(solution(k, coins));
    }
}
