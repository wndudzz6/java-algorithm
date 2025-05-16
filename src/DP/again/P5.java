package DP.again;

import java.util.Arrays;
import java.util.Scanner;

//5. 동전교환 (냅색 알고리즘)
public class P5 {

    static int solution(int n, int m, int[] coins){
        int[] dp = new int[m+1]; //i원 교환 최소 동전 수 ? 이상함.
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int coin : coins){
            for(int i = coin; i <= m; i++){
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }return dp[m];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins  = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        sc.close();
        System.out.println(solution(n, m, coins));
    }
}
