package DP;

import java.util.Arrays;
import java.util.Scanner;

//5. 동전교환(냅색 알고리즘) ~ 경우의 수로 접근했다가 깨짐
//최적화 문제로 접근하는게 맞다. 백준 2293 동전1 - 경우의 수 (조합 DP)
public class P5T {
    static int solution(int n, int m, int[] coins){
        int[] dp = new int[m+1]; //dp[i]를 만들 수 있는 동전 최소 개수 저장
        Arrays.fill(dp, Integer.MAX_VALUE-1);
        dp[0] = 0;
        for(int coin : coins){
            for(int i = coin; i <= m; i++){
                dp[i] = Math.min(dp[i], dp[i-coin]+1);
            }
        }
        return dp[m];
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
